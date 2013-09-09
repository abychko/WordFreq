import java.util.HashMap;

public class Vocabulary {

    private HashMap<String, Integer> _vocabulary = new HashMap<String, Integer>();

    public void updateWord(String word) {
        if(!word.isEmpty()){
        Integer count = 1;
        for (String key : _vocabulary.keySet()) {
            if (key.equals(word)) {
                count += _vocabulary.get(key);
            }
        }
        _vocabulary.put(word, count);
    }}

    public void updateWords(String[] words){
        for (String word : words){
            updateWord(word);
        }
    }


    public String printAll() {
        return _vocabulary.toString();
    }
    public int getSize(){
        return _vocabulary.size();
    }
}
