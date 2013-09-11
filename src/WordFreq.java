import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nerff on 09.09.13.
 */
public class WordFreq {


    public static void main(String args[]) throws FileNotFoundException {

        final String exportFile = "/tmp/voc_export.csv";

        if (args.length > 0) {
            Scanner mScanner = new Scanner(new File(args[0]));
            Vocabulary mVocabulary = new Vocabulary();
            WordExtractor mExtractor = new WordExtractor();
            while (mScanner.hasNextLine()) {
                String mLine = mScanner.nextLine().toLowerCase();
                String[] words = mExtractor.extractWords(mLine);
                mVocabulary.updateWords(words);
            }
            System.out.println("\nVocabulary contains " + mVocabulary.getSize() + " pairs");
            Exporter mExporter = new CsvExporter();
            mExporter.export(mVocabulary, exportFile);
        } else {
            System.out.println("Nothing to read");
        }
    }
}