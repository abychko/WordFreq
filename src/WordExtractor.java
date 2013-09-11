/**
 * Created by nerff on 09.09.13.
 */
public class WordExtractor {
    String[] extractWords(String line) {
        String[] words = line.replaceAll("\\W", " ").split("\\s+");
        return words;
    }
}
