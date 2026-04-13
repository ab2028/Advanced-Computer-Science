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
        return true;
    }

    public ArrayList<Word> searchAnagrams(String key) {
        Word wkey = new Word(key);
        ArrayList<Word> result = new ArrayList<>();
        for (Word word : wordList) {
            System.out.println(word.getSortedWord());
            System.out.println(wkey.getSortedWord());
            if (word.getSortedWord().equals(wkey.getSortedWord())) {
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