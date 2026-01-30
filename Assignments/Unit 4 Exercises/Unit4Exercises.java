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
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (Integer num : nums) {
            if (num >= 0) {
                result.add(num);
            }
        }
        return result;
    }


    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (Integer num : nums) {
            if (!(num >= 13 && num <= 19)) {
                result.add(num);
            }
        }
        return result;
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        ArrayList<String> result = new ArrayList<String>();
        for (String str : strs) {
            // last character y becomes yy
            if (!(str.length() > 0 && str.charAt(str.length() - 1) == 'y')) {
                result.add(str + "y");
            }
        }
        return result;
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        // exclude any results that end in 5 or 6
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (Integer num : nums) {
            int squaredPlus10 = num * num + 10;
            if (!(squaredPlus10 % 10 == 5 || squaredPlus10 % 10 == 6)) {
                result.add(squaredPlus10);
            }
        }
        return result;
    }

}
