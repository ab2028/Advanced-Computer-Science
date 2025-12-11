public class DecompositionSolution {
    public static void run() {
        int[] steps = stepsArray();
        int[] hours = hoursArray();
        int[] activeMinutes = activeMinutesArray();


        if (!lengthValidator(steps, hours, activeMinutes)) {
            System.out.println("Invalid input: arrays must be the same length.");
            return;
        }

        // Total steps
        int totalSteps = sum(steps);
        double average = average(steps);

        // Total Active Minnutes
        int totalActiveMinutes = sum(activeMinutes);
        double averageActiveMinutes = average(activeMinutes);
        int activeHourCount = countActiveHours(activeMinutes);



        // Morning vs Midday vs Afternoon averages


        double avgMorning = boundedAverage(steps, 0, 3);
        double avgMidday = boundedAverage(steps, 4, 7);
        double avgAfternoon = boundedAverage(steps, 8, 11);



    }

    public static int[] hoursArray() {
        return new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    }

    public static int[] stepsArray() {
        return new int[] {120, 90, 60, 50, 80, 300, 1200, 2200, 2800, 2500, 1800, 900};
    }

    public static int[] activeMinutesArray() {
        return new int[] {2, 1, 0, 0, 1, 10, 35, 50, 55, 48, 32, 15};
    }

    // Methods have to have a single purpose

    public static boolean lengthValidator(int[] array1, int[] array2, int[] array3) {

        return array1.length == array2.length && array2.length == array3.length;


    }

    public static int sum(int[] array) {
        int sumTotal = 0;
        for (int i = 0; i < array.length; i++) {
            sumTotal += array[i];
        }
        return sumTotal;
    }

    public static double average(int[] array) {
        return ((double) sum(array)) / array.length;
    }

    public static int countActiveHours(int[] array) {
        int activeHourCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 30) {
                activeHourCount++;
            }
        }
        return activeHourCount;
    }
    // or threshold counter when 30 -> argument

    // the reason its an active hour - is because 30 minutes could account for hour wraps? or is it
    // day by day?
    // but it doesnt account for , what if you worked out for 45 mins only ('false positive')?


    // the better way would be to create a sub array method then just use average method 

    public static int boundedCount(int[] array, int lowBound, int hiBound) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i >= lowBound && array[i] <= hiBound) {
                count++;
            }
        }
        return count;
    }

    public static int boundedSum(int[] array, int lowBound, int hiBound) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i >= lowBound && array[i] <= hiBound) {
                sum += array[i];
            }
        }
        return sum;
    }

    // increment index + no redundant arg (hour is unnecessary)

    public static double boundedAverage(int[] array, int lowBound, int hiBound) {
        return ((double) boundedSum(array, lowBound, hiBound))
                / boundedCount(array, lowBound, hiBound);
    }


    // printReport hours steps activeMinutes





}
