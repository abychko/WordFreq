/**
 * Created by abychko on 11.09.13.
 */
public class WordEntry implements Comparable {
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

    @Override
    public int compareTo(Object o) {
        WordEntry wordEntry = (WordEntry) o;
        String word = wordEntry.get_word();
        int res = 0;
        //
        if (_frequency > wordEntry.get_frequency()) {
            res = 1;
        } else if (_frequency < wordEntry.get_frequency()) {
            res = -1;
        } else if (_frequency == wordEntry.get_frequency()) {
            res = _word.compareTo(word);
        } else {
            System.out.println("Compare error!");
            System.exit(-1);
        }

        return res;
    }
}
