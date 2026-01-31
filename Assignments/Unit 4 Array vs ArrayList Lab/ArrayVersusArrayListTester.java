public class ArrayVersusArrayListTester {
    public static void main(String[] args) {
        // Test lastComesFirst array
        String[] a1 = {"hi0", "hi1", "hi2", "hi3", "hi4", "hi5"};
        ArrayVersusArrayList.lastComesFirst(a1);
        System.out.println(ArrayVersusArrayList.printArray(a1));



        String[] strArray = {"first", "second", "third", "fourth", "fifth"};
        String[] expectedArray = {"fifth", "first", "second", "third", "fourth"};

        System.out.println("\tTesting lastComesFirst():");
        System.out.println("\tOriginal: " + ArrayVersusArrayList.printArray(strArray));
        System.out.println("\tExpecting: " + ArrayVersusArrayList.printArray(expectedArray));

        ArrayVersusArrayList.lastComesFirst(strArray);
        System.out.println("\tOutput: " + ArrayVersusArrayList.printArray(strArray));
        System.out.println("\tResult: "
                + (ArrayVersusArrayList.printArray(expectedArray).equals(ArrayVersusArrayList.printArray(strArray)) ? "PASS" : "FAIL"));

    }


}
