public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day % 6 == 0) {
                return "off";
            }
            return "10:00";
        } else {
            if (day % 6 == 0) {
                return "10:00";
            }
            return "7:00";
        }
    }

    public static boolean love6(int a, int b) {
        return Math.pow((a - 6), 2) == Math.pow(b, 2) || (Math.pow((b - 6), 2) == Math.pow(a, 2))
                || (a == 6) || (b == 6);
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        }
        if (a == b && b == c) {
            return 5;
        }
        if (b != a && c != a) {
            return 1;
        }
        return 0;
    }

    public static String fizzString(String str) {
        String output = "";
        if (str.equals("")) {
            return output;
        }
        if (str.charAt(0) == 'f') {
            output += "Fizz";
        }
        if (str.charAt(str.length() - 1) == 'b') {
            output += "Buzz";
        }
        if (output.equals("")) {
            output = str;
        }
        return output;
    }

    public static String doubleChar(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            output += str.charAt(i);
            output += str.charAt(i);
        }
        return output;
    }

    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count += 1;
            }
        }
        return count;
    }

    public static boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                countCat += 1;
            }
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("dog")) {
                countDog += 1;
            }
        }
        return countCat == countDog;
    }

    public static String mixString(String a, String b) {
        String output = "";
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            output += a.charAt(i);
            output += b.charAt(i);
        }
        if (a.length() > b.length()) {
            output += a.substring(b.length());
        } else {
            output += b.substring(a.length());
        }
        return output;

    }

    public static String repeatEnd(String str, int n) {
        String output = "";
        for (int i = 0; i < n; i++) {
            output += str.substring(str.length() - n);
        }

        return output;
    }

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() > b.length()) {
            return a.substring(a.length() - b.length()).equals(b);
        } else {
            return b.substring(b.length() - a.length()).equals(a);
        }
    }

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")) {
                count += 1;
            }
        }
        return count;
    }

    public static int countEvens(int[] nums) {
        // fix
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += 1 - Math.abs((nums[i] % 2));
        }
        return count;

    }

    public static int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0]; 
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        System.out.println(max + " " + min);
        return max - min;
    }

    public static int sum13(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int sum = 0;
        int mult = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                mult = 0;
            }
            sum += mult * nums[i];

        }

        return sum;
    }

    public static int[] fizzArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }

    public static boolean haveThree(int[] nums) {
        int c3 = 0;
        boolean adj3 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                c3 += 1;
                if ((i < nums.length - 1) && nums[i + 1] == 3) {
                    return false;
                }
            }
        }
        return c3 == 3;

    }

    public static String[] fizzArray2(int n) {
        if (n == 0) {
            return new String[0];
        }
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = "" + i;
        }
        return array;

    }

    public static int[] zeroFront(int[] nums) {
        int[] output = new int[nums.length];
        int zc = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                output[zc] = 0;
                zc += 1;
            }
        }
        int nzc = zc;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                output[nzc] = nums[i];
                nzc += 1;
            }
        }
        return output;
    }

    public static String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                count += 1;
            }
        }
        String[] output = new String[words.length - count];
        int gc = 0;
        for (int i = 0; i < words.length; i++) {
            if (!(words[i].equals(target))) {
                output[gc] = words[i];
                gc += 1;
            }
        }
        return output;
    }

    public static int scoresAverage(int[] scores) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < scores.length / 2; i++) {
            sum1 += scores[i];
            sum2 += scores[i + scores.length / 2];
        }
        return Math.max(sum1, sum2) / (scores.length / 2);
    }

    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        return helpscoresSpecial(a) + helpscoresSpecial(b);
    }

    // self-made helper method
    public static int helpscoresSpecial(int[] scores) {
        int max = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] % 10 == 0) {
                max = Math.max(max, scores[i]);
            }
        }
        return max;
    }

    public static String firstTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        }
        if (str.length() == 1) {
            return str.substring(0, 1) + "*";
        }
        return "**";
    }

    public static double divide(int a, int b) {
        if (Math.min(a, b) == 0) {
            return 0.0;
        }
        return (double) Math.max(a, b) / Math.min(a, b);
    }
}
