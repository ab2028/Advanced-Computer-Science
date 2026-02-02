import java.util.ArrayList;

public class ArrayListPracticeTester {
    public static void main(String[] args) {
        // Test countOddLength
        ArrayList<String> A1 = new ArrayList<String>();
        A1.add("a");
        A1.add("b");
        A1.add("2343");
        int oddCount1 = ArrayListPractice.countOddLength(A1);
        System.out.println("Odd length count (expected 2): " + oddCount1);

        // Test countOddLengthForEachLoop
        ArrayList<String> A2 = new ArrayList<String>();
        A2.add("a");
        A2.add("b");
        A2.add("2343");
        int oddCount2 = ArrayListPractice.countOddLengthForEachLoop(A2);
        System.out.println("Odd length count (expected 2): " + oddCount2);

        // Test removeStrings
        ArrayList<String> A3 = new ArrayList<String>();
        A3.add("aa");
        A3.add("sdfsdf");
        A3.add("aaa");
        ArrayListPractice.removeStrings(A3, 'a');
        System.out.println("After removeStrings (expected [sdfsdf]): " + A3);

        // Test removeStrings2
        ArrayList<String> A4 = new ArrayList<String>();
        A4.add("aa");
        A4.add("sdfsdf");
        A4.add("aaa");
        ArrayListPractice.removeStrings2(A4, 'a');
        System.out.println("After removeStrings2 (expected [sdfsdf]): " + A4);

        // Test numCount
        ArrayList<Integer> A5 = new ArrayList<Integer>();
        A5.add(5);
        A5.add(3);
        A5.add(5);
        A5.add(5);
        A5.add(3);
        A5.add(5);
        A5.add(2);
        int countFives = ArrayListPractice.numCount(A5, 5);
        System.out.println("Number of fives (expected 4): " + countFives);
    }
}
