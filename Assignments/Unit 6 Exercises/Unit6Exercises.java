public class Unit6Exercises {

    /**
     * Problem 1 - Factorial: Write a recursive and non-recursive method that returns the factorial
     * of a given number n.
     */
    public static int factorial(int n) {
        int result = 1;

        while (n > 0) {
            result *= n;
            n -= 1;
        }
        return result;

    }

    public static int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    /** 
     * Problem 2 - Fibonacci Sequence: Write a recursive and non-recursive method that returns the
     * nth number in the Fibonacci sequence.
     */
    // binet's formula
    public static int fibonacci(int n) {
        return (int) ((Math.pow ((1 + Math.sqrt(5)) / 2.0 , n) - Math.pow ((1 - Math.sqrt(5)) / 2.0 , n)) / (Math.sqrt(5))); 
    }

    public static int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacciRecursive(n - 2) + fibonacciRecursive(n - 1);
    }

    /**
     * Problem 3 - Sum of Digits: Write a recursive and non-recursive method that returns the sum of
     * the digits of a given integer.
     */

    // helper
    public static int truncateLast(int n) {
        return (int) (n / 10);
    }
    public static int sumDigits(int n) {
        int result = 0;
        while (n > 0) {
            result += (n % 10);
            n = truncateLast(n);
        }
        return result;

    }

    public static int sumDigitsRecursive(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + sumDigitsRecursive(truncateLast(n));
    }

    /**
     * Problem 4 - Count X: Write a recursive and non-recursive method that returns the count of
     * occurrences of 'x' in a given string.
     */
    public static int countX(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                result += 1;
            }
        }
        return result;
    }

    public static int countXRecursive(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.length() == 1) {
            return str.equals("x") ? 1 : 0;
        }
        return countXRecursive(str.substring(0, 1)) + countXRecursive(str.substring(1));
    }

    /**
     * Problem 5 - Reverse String: Write a recursive and non-recursive method that returns the
     * reverse of a given string.
     */
    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static String reverseStringRecursive(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str;
        }
        return str.substring(str.length() - 1) + reverseStringRecursive(str.substring(0, str.length() - 1));
    }
    

    /**
     * Problem 6 - Power of a Number: Write a recursive and non-recursive method that calculates and
     * returns the value of base raised to the power of exponent.
     */
    public static int power(int base, int exponent) {
        return 0;
    }

    public static int powerRecursive(int base, int exponent) {
        return 0;
    }

    /**
     * Problem 7 - Palindrome Checker: Write a recursive and non-recursive method that checks
     * whether a given string is a palindrome.
     */
    public static boolean isPalindrome(String str) {

        return false;
    }

    public static boolean isPalindromeRecursive(String str) {
        return false;
    }

    /**
     * Problem 8 - Greatest Common Divisor (GCD): Write a recursive and non-recursive method that
     * finds and returns the greatest common divisor of two numbers.
     */
    // EUCLIDEAN ALGORITHM
    public static int gcd(int a, int b) {
        return 0;
    }

    public static int gcdRecursive(int a, int b) {
        return 0;
    }

    /**
     * Problem 9 - Bunny Ears 2: We have bunnies standing in a line, numbered 1, 2, ... The odd
     * bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears,
     * because they each have a raised foot. Recursively return the number of "ears" in the bunny
     * line 1, 2, ... n (without loops or multiplication).
     */

    public static int bunnyEars(int bunnies) {
        return 0;

    }

    public static int bunnyEarsRecursive(int bunnies) {
        return 0;
    }

    /**
     * Problem 10 - Binary Search: Write a recursive and non-recursive method that implements the
     * binary search algorithm to find and return the index of a given element in a sorted array.
     */
    public static int binarySearch(int[] arr, int key) {

        return -1; // Element not found
    }

    public static int binarySearchRecursiveHelper(int[] arr, int key, int low, int high) {
        return -1;
    }

     // DO NOT EDIT! Work on the helper version above this method. This method is to be used for testing purposes only.
     public static int binarySearchRecursive(int[] arr, int key) {
        return binarySearchRecursiveHelper(arr, key, 0, arr.length-1); // Element not found
    }


}
