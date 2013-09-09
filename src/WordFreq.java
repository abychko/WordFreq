import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by nerff on 09.09.13.
 */
public class WordFreq {


    public static void main(String args[]) throws FileNotFoundException {

        if (args.length > 0) {

            Vocabulary mVocabulary = new Vocabulary();
            Scanner mScanner = new Scanner(new File(args[0]));
            WordExtractor mExtractor = new WordExtractor();

            while (mScanner.hasNextLine()) {
                String mLine = mScanner.nextLine().toLowerCase();
                String[] words = mExtractor.extractWords(mLine);
                mVocabulary.updateWords(words);
            }
            System.out.println(mVocabulary.printAll());
            System.out.println("Vocabulary contains " + mVocabulary.getSize() + " pairs");
        } else {
            System.out.println("Nothing to read");
        }
    }
}