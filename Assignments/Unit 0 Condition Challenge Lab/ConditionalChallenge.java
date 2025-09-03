public class ConditionalChallenge {
    public static void main(String[] args) {

        // Part 1: Temperature Converter
        double temperature = 70;
        boolean isCold = true;

        if (isCold) {
            temperature -= 15;
        } else {
            temperature += 10;
        }
        System.out.println("Temperature: " + temperature);

        // Part 2: Grade Calculator
        int score = 90;
        if (score >= 70) {
            System.out.println(score + ": Passed");
        } else {
            System.out.println(score + ": Failed");
        }

        // Part 3: Season Determiner
        int temp = 75; // Prevent reusing variables
        String season = null;
        if (temp > 80) {
            season = "Summer";
        } else if (temp >= 60) {
            season = "Spring";
        } else if (temp >= 40) {
            season = "Fall";
        } else {
            season = "Winter";
        }
        System.out
                .println("The temperature is " + temp + " degrees. The season is " + season + ".");


        // Part 4: Number Classifier
        int number = 220;
        String sign = null;
        String descriptor = null;
        if (number > 0) {
            sign = "Positive";
        } else if (number < 0) {
            sign = "Negative";
        } else {
            sign = "Zero";
        }
        if (number > 100) {
            descriptor = ", and Large";
        } else if (number < -100) {
            descriptor = ", and Very Negative";
        }
        System.out.println(number + " is " + sign + descriptor);

    }
}
