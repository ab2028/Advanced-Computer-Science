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

    public static void testCalculateSumOfSquares() {
        // Test Case - Main Case
        int[] numbers = {1, 2, 3, 4};
        // expected output: 30
        System.out.println("Expected 30: " + Unit3Exercises.calculateSumOfSquares(numbers));
        // Test Case - Edge Case: Null array
        try {
            numbers = null;
            System.out.println(
                    "Expected exception: " + Unit3Exercises.calculateSumOfSquares(numbers));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }

    }

    public static void testGetNthFibonacci() {
        // Test Case - Main Case
        int n = 4;
        // expected output: 3
        System.out.println("Expected 3: " + Unit3Exercises.getNthFibonacci(n));

        // Test Case - Edge Case: Negative n
        try {
            n = -5;
            System.out.println("Expected exception: " + Unit3Exercises.getNthFibonacci(n));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the n was null, as intended");
        }

    }

    public static void testSortArrayDescending() {

        // Test Case - Main Case
        int[] arr = {5, 2, 8, 1, 4};
        Unit3Exercises.sortArrayDescending(arr);
        System.out.print("Expected 8 5 4 2 1 : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // Test Case - Edge Case: Negative numbers
        arr = new int[] {-1, -3, -2, -5, -4};
        Unit3Exercises.sortArrayDescending(arr);
        System.out.print("\nExpected -1 -2 -3 -4 -5 : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // Test Case - Edge Case: Null array
        try {
            arr = null;
            Unit3Exercises.sortArrayDescending(arr);
        } catch (Exception e) {
            System.out.println("\n" + e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }

    }

    public static void testFindLongestWord() {
        // Test Case - Main Case
        String sentence = "Hello worlds";
        // expected output: "worlds"
        System.out.println("Expected worlds: " + Unit3Exercises.findLongestWord(sentence));
        String sentence2 = "All the world's a stage";
        // expected output: "world's"
        System.out.println("Expected world's: " + Unit3Exercises.findLongestWord(sentence2));
        // Test Case - Main Case: Multiple longest words
        sentence = "Hello world";
        // expected output: "Hello"
        System.out.println("Expected Hello: " + Unit3Exercises.findLongestWord(sentence));
        // Test Case - Edge Case: Null sentence
        try {
            sentence = null;
            System.out.println("Expected exception: " + Unit3Exercises.findLongestWord(sentence));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the sentence was null, as intended");
        }
    }

    public static void testCalculateInterest() {

        // Test Case - Main Case
        double principal = 1000.0;
        double rate = 5.0;
        int years = 2;
        // expected output: 1102.5
        System.out.println(
                "Expected 1102.5: " + Unit3Exercises.calculateInterest(principal, rate, years));

        // Test Case - Edge Case: Negative principal
        try {
            principal = -1000.0;
            rate = 5.0;
            years = 2;
            System.out.println("Expected exception: "
                    + Unit3Exercises.calculateInterest(principal, rate, years));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the principal was negative, as intended");
        }
        // Test Case - Edge Case: Negative rate
        try {
            principal = 1000.0;
            rate = -5.0;
            years = 2;
            System.out.println("Expected exception: "
                    + Unit3Exercises.calculateInterest(principal, rate, years));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the rate was negative, as intended");
        }

        // Test Case - Edge Case: Negative years
        try {
            principal = 1000.0;
            rate = 5.0;
            years = -2;
            System.out.println("Expected exception: "
                    + Unit3Exercises.calculateInterest(principal, rate, years));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the years was negative, as intended");
        }



    }

    public static void testParsePositiveInteger() {
        // Test Case - Main Case
        String str = "5";
        // expected output: 5
        System.out.println("Expected 5: " + Unit3Exercises.parsePositiveInteger(str));

        // Test Case - Edge Case: Negative number
        String negativeStr = "-3";
        // expected output: 1
        System.out.println("Expected 1: " + Unit3Exercises.parsePositiveInteger(negativeStr));

        // Test Case - Edge Case: Non-integer string
        String nonIntegerStr = "abc";
        try {
            System.out.println(
                    "Expected exception: " + Unit3Exercises.parsePositiveInteger(nonIntegerStr));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the string was not a valid integer, as intended");

        }
        // Test Case - Edge Case: Null string
        try {
            str = null;
            System.out.println("Expected exception: " + Unit3Exercises.parsePositiveInteger(str));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the string was null, as intended");
        }

    }


    public static void testGetArrayElement() {
        // Test Case - Main Case
        String[] arr = {"apple", "banana", "cherry"};
        int index = 1;
        // expected output: "banana"
        System.out.println("Expected banana: " + Unit3Exercises.getArrayElement(arr, index));

        // Test Case - Edge Case: Null array
        try {
            arr = null;
            index = 0;
            System.out.println("Expected exception: " + Unit3Exercises.getArrayElement(arr, index));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }

        // Test Case - Edge Case: Index out of bounds
        try {
            arr = new String[] {"apple", "banana", "cherry"};
            index = 5;
            System.out.println("Expected exception: " + Unit3Exercises.getArrayElement(arr, index));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the index was out of bounds, as intended");
        }

    }

    public static void testCalculateSquareRoot() {
        // Test Case - Main Case
        int number = 16;
        // expected output: 4.0
        System.out.println("Expected 4.0: " + Unit3Exercises.calculateSquareRoot(number));

        // Test Case - Edge Case: Negative number
        try {
            number = -9;
            System.out.println("Expected exception: " + Unit3Exercises.calculateSquareRoot(number));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the number was negative, as intended");
        }
    }

    public static void testSumArrayElements() {
        // Test Case - Main Case
        int[] array = {1, 2, 3, 4, 5};
        // expected output: 15
        System.out.println("Expected 15: " + Unit3Exercises.sumArrayElements(array));

        // Test Case - Edge Case: Null array
        try {
            array = null;
            System.out.println("Expected exception: " + Unit3Exercises.sumArrayElements(array));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out
                    .println("The method threw an exception when the array was null, as intended");
        }

    }

    public static void testCalculatePower() {
        // Test Case - Main Case
        double base = 2.0;
        int exponent = 3;
        // expected output: 8.0
        System.out.println("Expected 8.0: " + Unit3Exercises.calculatePower(base, exponent));

        // Test Case - Edge Case: Negative exponent
        try {
            base = 2.0;
            exponent = -2;
            System.out.println(
                    "Expected exception: " + Unit3Exercises.calculatePower(base, exponent));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println(
                    "The method threw an exception when the exponent was negative, as intended");
        }
    }


    public static void main(String[] args) {
        // testCalculateStringLengthAverage();
        // testReverseString();
        // testFindMaxValue();
        // testIsPalindrome();
        // testSumEvenNumbers();
        // testCalculateSumOfSquares();
        // testGetNthFibonacci();
        // testSortArrayDescending();
        // testFindLongestWord();
        // testCalculateInterest();
        // testParsePositiveInteger();
        // testGetArrayElement();
        // testCalculateSquareRoot();
        // testSumArrayElements();
        // testCalculatePower();
    }


}
