/**
 * Created by abychko on 11.09.13.
 */
public class WordEntry {
    private String _word;
    private int _frequency;

    WordEntry(String word, int frequency) {
        this._frequency = frequency;
        this._word = word;
    }

    int get_frequency() {
        return _frequency;
    }

    String get_word() {
        return _word;
    }
}
