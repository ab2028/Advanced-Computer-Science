public class PurrfectUtils {
    public static String determineCatMood(Cat cat) {
        int moodLevel = cat.getMoodLevel();
        if (moodLevel <= 10 && moodLevel >= 7) {
            return "Currently, " + cat.getName() + " is in a great mood.\nPetting is appreciated.";
        } else if (moodLevel <= 7 && moodLevel >= 3) {
            return "Currently, " + cat.getName()
                    + " is reminiscing of a past life.\nPetting is acceptable.";
        } else {
            return "Currently, " + cat.getName()
                    + " is plotting revengeance.\nPetting is extremely risky.";
        }
    }

    public static char generateCatChar(String catId) {
        int sum = 0;
        for (int i = 0; i < catId.length(); i++) {
            char c = catId.charAt(i);
            sum += Integer.parseInt(("" + c)); // convert digit char to its numeric value, not ascii
        }
        return (char) ((sum % 26) + 'A');
    }


    public static int generateRandomNumber(int low, int high) {
        // swap high,low if low > high
        if (low > high) {
            int temp = low;
            low = high;
            high = temp;
        }

        return (int) (Math.random() * (high - low)) + low;

    }

    public static String validateCatId(String catId) {
        // first convert string to int
        int catIdInt;
        catIdInt = Integer.parseInt(catId);
        if (catIdInt < 1000 || catIdInt > 9999) {
            return "" + generateRandomNumber(1000, 10000);
        }
        return catId;
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel < 0) {
            return 0;
        } else if (moodLevel > 10) {
            return 10;
        } else {
            return moodLevel;
        }
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet...");
        if (cat.getMoodLevel() >= 2) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");
        } else {
            if (cat.isHungry()) {
                cat.setMoodLevel(cat.getMoodLevel() - 1);
                System.out.println("Petting failed...");
            } else {
                cat.setMoodLevel(cat.getMoodLevel() + 1);
                System.out.println("Petting successful!");
            }
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        int dec = PurrfectUtils.generateRandomNumber(1, 3);
        if (dec == 1) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println(cat.getName() + " did not like that...");
        } else {
            cat.setMoodLevel(cat.getMoodLevel() - 2);
            System.out.println(cat.getName() + " really hated that!");
        }

    }

    public static void cleanLitterBox(Cat cat) {
        System.out.println("Cleaning the litter box...");
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
        System.out.println("Done!");
        System.out.println(cat.getName() + " appreciated that.");
    }

    public static void feed(Cat cat) {
        System.out.println("Filling up " + cat.getName() + "'s bowl'...");
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(false);
        System.out.println("Done!");
        System.out.println(cat.getName() + " is eating...");
        System.out.println(cat.getName() + " is full!");
    }



}
