import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {

        if (n > nums.length) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[nums.length - n + i]) {
                return false;
            }
        }
        return true;
    }


    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] + nums[i + 1]) % 2 == 0 && (nums[i] + nums[i + 2]) % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        if (start >= end) {
            return new int[0];
        }
        int[] sequence = new int[end - start];
        for (int i = start; i < end; i++) {
            sequence[i - start] = i;
        }
        return sequence;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        String[] sequence = new String[end - start];
        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sequence[i - start] = "FizzBuzz";
            } else if (i % 3 == 0) {
                sequence[i - start] = "Fizz";
            } else if (i % 5 == 0) {
                sequence[i - start] = "Buzz";
            } else {
                sequence[i - start] = "" + i;
            }
        }
        return sequence;

    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        // if all odd, return original array (in same order)

        int[] rearranged = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;
        int oddCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                rearranged[evenIndex] = nums[i];
                evenIndex++;
            } else {
                rearranged[oddIndex] = nums[i];
                oddIndex--;
                oddCount++;
            }
        }
        if (oddCount == nums.length) {
            return nums;
        }
        return rearranged;
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();

    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

}
