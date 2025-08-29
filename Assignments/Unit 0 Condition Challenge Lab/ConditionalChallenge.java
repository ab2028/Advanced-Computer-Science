public class ConditionalChallenge {
    public static void main(String[] args) {
        // Your code will go here

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
        String season = "";
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
        int number = 22;
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        if (number > 100) {
            System.out.println("Large");
        } else if (number < -100) {
            System.out.println("Very Negative");
        }

    }
}
