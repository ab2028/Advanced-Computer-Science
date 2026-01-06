public class Unit3ExercisesTester {
    public static void testCalculateStringLengthAverage() {
        // Test Case - Main Case
        String[] letters = {"abc", "cde", "efg", "hij"};
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        // Test Case - Edge Case: Null element in array
        letters = new String[] {"abc", "cde", "efg", null, "hij"};
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge Case: Null array
        try {
            letters = null;
            System.out.println(
                    "Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testReverseString() {
        // Test Case - Main Case
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: String with spaces at the end and in the middle
        testString = " ab c ";
        System.out.println("Expected ' c ba ': " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: String with special characters
        testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: Null string
        try {
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.reverseString(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }
    }

    public static void testFindMaxValue() {
        // Test Case - Main Case
        int[] numbers = {1, 3, 2, 5, 4};
        // expected output: 5
        System.out.println("Expected 5: " + Unit3Exercises.findMaxValue(numbers));
        // Test Case - Edge Case: Negative numbers and zero
        numbers = new int[] {-1, -3, -2, 0, -4};
        // expected output: 0
        System.out.println("Expected 0: " + Unit3Exercises.findMaxValue(numbers));
        // Test Case - Edge Case: All negative numbers
        numbers = new int[] {-5, -3, -2, -8, -4};
        // expected output: -2
        System.out.println("Expected -2: " + Unit3Exercises.findMaxValue(numbers));
        // Test Case - Edge Case: Null array
        try {
            numbers = null;
            System.out.println("Expected exception: " + Unit3Exercises.findMaxValue(numbers));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }
    }

    public static void testIsPalindrome() {
        // Test Case - Main Case: Palindrome string
        String testString = "racecar";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(testString));
        // Test Case - Main Case: Non-palindrome string
        testString = "hello";
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(testString));
        // Test Case - Edge Case: Null string
        try {
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.isPalindrome(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }
        // Test Case - Edge Case: Empty string
        testString = "";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(testString));
    }

    public static void testSumEvenNumbers() {
        // Test Case - Main Case
        int[] numbers = {1, 2, 3, 4, 5, 6};
        // expected output: 12
        System.out.println("Expected 12: " + Unit3Exercises.sumEvenNumbers(numbers));
        // Test Case - Edge Case: Negative even and odd integers
        numbers = new int[] {-1, -2, -3, -4, -5, -6};
        // expected output: -12
        System.out.println("Expected -12: " + Unit3Exercises.sumEvenNumbers(numbers));
        // Test Case - Edge Case: Both positive and negative even and odd integers
        numbers = new int[] {-3, -2, -1, 0, 1, 2, 3};
        // expected output: 0
        System.out.println("Expected 0: " + Unit3Exercises.sumEvenNumbers(numbers));
        // Test Case - Edge Case: Null array
        try {
            numbers = null;
            System.out.println("Expected exception: " + Unit3Exercises.sumEvenNumbers(numbers));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }

    }

    public static void main(String[] args) {
        testCalculateStringLengthAverage();
        testReverseString();
        testFindMaxValue();
        testIsPalindrome();
        testSumEvenNumbers();
    }

}
