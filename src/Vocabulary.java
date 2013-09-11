import java.util.*;

public class Vocabulary {

    private Map<String, Integer> _vocabulary = new HashMap<String, Integer>();
    private int wcounter = 0;

    private void onUpdate() {
        System.out.print("Processed " + (++wcounter) + " words\r");
    }

    public void updateWord(String word) {
        if (!word.isEmpty()) {
            Integer count = 1;
            for (String key : _vocabulary.keySet()) {
                if (key.equals(word)) {
                    count += _vocabulary.get(key);
                }
            }
            _vocabulary.put(word, count);
            onUpdate();
        }
    }

    public void updateWords(String[] words) {
        for (String word : words) {
            updateWord(word);
        }
    }

    public int getSize() {
        return _vocabulary.size();
    }

    public List<WordEntry> asList() {
        List mList = new ArrayList<WordEntry>();
        for (String key : _vocabulary.keySet()) {
            mList.add(new WordEntry(key, _vocabulary.get(key)));

        }

        Collections.sort(mList, new Comparator<WordEntry, WordEntry>() {

            @Override
            public int compare(WordEntry we1, WordEntry we2) {
                int ret = 0;
                if (we1.get_frequency() == we2.get_frequency()) {
                    ret = we1.get_word().compareToIgnoreCase(we2.get_word());
                }
                return ret;
            }

            )
        };

        return mList;
    }


    //  }
}
