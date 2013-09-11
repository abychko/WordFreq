import java.util.HashMap;
import java.util.Map;

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
    //  public Map sortByValue(){

    //  }
}
