

import java.util.ArrayList;

public class Word {
    private String originalWord;
    private String sortedWord;

    public Word(String originalWord) {
        this.originalWord = originalWord;
        sortedWord = sortWord();
    }

    public String getOriginalWord() {
        return originalWord;
    }

    public String getSortedWord() {
        return sortedWord;
    }

    // uses selection sort
    public String sortWord() {
        String lowerWord = originalWord.toLowerCase();
        ArrayList<Character> letters = new ArrayList<>();
        // make list of letters
        for (int i = 0; i < lowerWord.length(); i++) {
            letters.add(lowerWord.charAt(i));
        }
        // use character - number equivalent value
        for (int i = 0; i < letters.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < letters.size(); j++) {
                if (letters.get(j) < letters.get(minIndex)) {
                    minIndex = j;
                }

            }

            // swap current index i with min index once found
            char temp = letters.get(i);
            letters.set(i, letters.get(minIndex));
            letters.set(minIndex, temp);

        }
        // build string
        String result = "";
        for (char c : letters) {
            result += c;
        }
        return result;

    }


}


