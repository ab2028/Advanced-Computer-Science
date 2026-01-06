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



}
