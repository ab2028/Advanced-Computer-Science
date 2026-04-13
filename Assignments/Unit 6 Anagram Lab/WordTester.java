public class WordTester {
    public static void main(String[] args) {

        Word w = new Word("ajgk");

        System.out.println(w.getSortedWord());

        AnagramList l = new AnagramList();

        l.add(w);

        System.out.println(l.searchAnagrams("agkj"));

    }
}
