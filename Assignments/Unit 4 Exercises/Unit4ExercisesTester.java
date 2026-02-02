import java.util.ArrayList;

public class Unit4ExercisesTester {
    public static void main(String[] args) {

        if (true) {
            // Test Method 1: matchingEndSequences
            int[] a = {1, 2, 3, 1, 2, 3};
            System.out.println(
                    "matchingEndSequences T1: " + Unit4Exercises.matchingEndSequences(a, 3));
            // true
            int[] b = {1, 2, 3, 4, 5};
            System.out.println(
                    "matchingEndSequences T2: " + Unit4Exercises.matchingEndSequences(b, 2));
            // false



            // Test all even/all odd
            int[] c = {0, 2, 4, 6, 8};
            int[] d = {1, 3, 5, 7};
            int[] e = Unit4Exercises.moveEvenBeforeOdd(c);
            int[] f = Unit4Exercises.moveEvenBeforeOdd(d);
            for (int i = 0; i < e.length; i++) {
                System.out.print(e[i] + " ");
            }
            System.out.println("");
            for (int i = 0; i < f.length; i++) {
                System.out.print(f[i] + " ");
            }
            System.out.println("");

            // Test mixed 0/odd
            int[] x = {0, 1, 0, 3};
            int[] y = Unit4Exercises.moveEvenBeforeOdd(x);
            for (int i = 0; i < y.length; i++) {
                System.out.print(y[i] + " ");
            }
            System.out.println("");
        }

        // Test noNegatives
        ArrayList<Integer> g = new ArrayList<Integer>();
        g.add(1);
        g.add(-2);
        g.add(3);
        g.add(-4);
        g.add(5);
        System.out.println(Unit4Exercises.noNegatives(g));


        // Test excludeTeenNumbers
        ArrayList<Integer> h = new ArrayList<Integer>();
        h.add(13);
        h.add(15);
        h.add(19);
        h.add(20);
        h.add(22);
        System.out.println(Unit4Exercises.excludeTeenNumbers(h));

        // Test appendY
        ArrayList<String> i = new ArrayList<String>();
        i.add("ay");
        i.add("hey");
        i.add("b");
        i.add("c");
        System.out.println(Unit4Exercises.appendY(i));

        // Test squarePlus10
        ArrayList<Integer> j = new ArrayList<Integer>();
        j.add(1);
        j.add(2);
        j.add(3);
        j.add(4);
        System.out.println(Unit4Exercises.squarePlus10(j));

    }

}
