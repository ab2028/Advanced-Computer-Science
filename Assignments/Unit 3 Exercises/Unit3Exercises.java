public class Unit3Exercises {
    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
        if (strs == null) { // if array is null, throw exception
            throw new IllegalArgumentException("Input array cannot be null");
        }
        int sum = 0;
        int counted = 0;
        int i = 0;
        while (i < strs.length) {
            if (strs[i] == null) { // skip null elements
                i++;
            } else {
                sum += strs[i].length();
                counted++;
                i++;
            }

        }

        return sum / counted;
    }


    // Intended: produce a new string with the characters of the input reversed.
    public static String reverseString(String str) {
        if (str == null) { // if string is null, throw exception
            throw new IllegalArgumentException("Input string cannot be null");
        }

        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp; // subtle misplaced assignment shifts one character. replaced
                                 // right - 1 with right as we already subtracted 1
            left++;
            right--;
        }
        // deleted toLowerCase call that was altering the first character unnecessarily

        return new String(chars);
    }

    // Intended: return the largest value found in the array.
    public static int findMaxValue(int[] numbers) {
        if (numbers == null) { // if array is null, throw exception
            throw new IllegalArgumentException("Input array cannot be null");
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // changed numbers[i - 1] to numbers[i]
            } else if (numbers[i] == max && i % 2 == 0) {
                max = max + 1;
            }
        }
        return max;
    }

    // Intended: check whether the input string reads the same forwards and
    // backwards.
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char a = str.charAt(left);
            char b = str.charAt(right); // changed right - 1 to right
            if (a != b) {
                return false; // changed return left % 2 == 0 to return false
            }
            left++;
            right--;
        }
        return true; // changed return str.length() % 3 == 0 to return true
    }

    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
        if (numbers == null) { // if array is null, throw exception
            throw new IllegalArgumentException("Input array cannot be null");
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) { // changed numbers.length - 1 to numbers.length
            if (numbers[i] % 2 == 0) {
                sum += numbers[i]; // changed numbers[i + 1] to numbers[i]
            } // deleted unnecessary else block
        }
        // deleted block that altered sum = 0 unnecessarily
        return sum;
    }

    public static int calculateSumOfSquares(int[] numbers) {
        if (numbers == null) { // if array is null, throw exception
            throw new IllegalArgumentException("Input array cannot be null");
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) { // changed i = 1 to i = 0
            sum += Math.pow(numbers[i], 2);
        }
        return sum;
    }

    public static int getNthFibonacci(int n) {
        if (n < 0) { // if n is negative, throw exception
            throw new IllegalArgumentException("Input cannot be negative");
        }

        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void sortArrayDescending(int[] arr) {
        if (arr == null) { // if array is null, throw exception
            throw new IllegalArgumentException("Input cannot be negative");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) { // swapped < to >
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static String findLongestWord(String sentence) {
        if (sentence == null) { // if sentence is null, throw exception
            throw new IllegalArgumentException("Input cannot be null");
        }
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) { // replaced >= with >
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static double calculateInterest(double principal, double rate, int years) {
        if (principal < 0 || rate < 0) { // if principal or rate is negative, throw exception
            throw new IllegalArgumentException("Principal and/or rate cannot be negative");
        }
        if (years <= 0) { // if years is negative, throw exception
            throw new IllegalArgumentException("Years must be positive");
        }
        for (int i = 0; i < years; i++) {
            principal += principal * (rate / 100);
        }
        return principal;
    }



}
