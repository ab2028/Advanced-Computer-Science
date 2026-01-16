public class Unit4ExercisesTester {
    public static void main(String[] args) {
        // Test Method 1: matchingEndSequences
        int[] a = {1, 2, 3, 1, 2, 3};
        System.out.println(
                "matchingEndSequences T 1: " + Unit4Exercises.matchingEndSequences(a, 3)); // true
        int[] b = {1, 2, 3, 4, 5};
        System.out.println(
                "matchingEndSequences T 2: " + Unit4Exercises.matchingEndSequences(b, 2)); // false


        // Test all even/all odd
        int[] c = {2, 4, 6, 8};
        int[] d = {1, 3, 5, 7};
        int[] e = Unit4Exercises.moveEvenBeforeOdd(c);
        int[] f = Unit4Exercises.moveEvenBeforeOdd(d);
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " ");
        }
        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i] + " ");
        }

    }

}
