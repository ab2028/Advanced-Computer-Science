import java.util.ArrayList;
import java.util.AbstractList;

public class AnagramList extends AbstractList {
    private ArrayList<Word> wordList;

    public AnagramList() {
        wordList = new ArrayList<>();
    }

    public boolean add(Word word) {
        wordList.add(word);
        return true;
    }

    public boolean checkAnagram(Word word1, Word word2) {
        if (word1.getSortedWord().equals(word2.getSortedWord())) {
            return true;
        }
        return false;
    }

    public ArrayList<Word> searchAnagrams(String key) {
        Word wkey = new Word(key);
        ArrayList<Word> result = new ArrayList<>();
        for (Word word : wordList) {
            if (checkAnagram(word, wkey)) {
                result.add(word);
            }
        }
        return result;
    }

    public Word get(int index) {
        return wordList.get(index);
    }

    public int size() {
        return wordList.size();
    }

}
