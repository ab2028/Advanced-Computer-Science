public class AnagramListTester {
    public static void main(String[] args) {

        Word w = new Word("Ajgk");

        System.out.println(w.getSortedWord());

        Word v = new Word("agkj");

        System.out.println(v.getSortedWord());

        AnagramList l = new AnagramList();

        l.add(w);

        System.out.println(l.searchAnagrams("agkj"));

    }

}
