// Solution: Unit 0 Exercises
public class Unit0Exercises {


    public static void main(String[] args) {
        Unit0Exercises obj = new Unit0Exercises();
        System.out.println();

        // testing sleepIn() method
        System.out.println(obj.sleepIn(false, false));
        System.out.println(obj.sleepIn(false, true));
        System.out.println(obj.sleepIn(true, false));
        System.out.println(obj.sleepIn(true, true));
        
        // sleepIn(true, false) -> true
        // sleepIn(false, true) -> true

        // testing diff21() method
        System.out.println(obj.diff21(19)); // ouput: 2
        System.out.println(obj.diff21(21)); // ouput: 0
        System.out.println(obj.diff21(23)); // ouput: 4

        // testing flooringCalculator() method
        System.out.println(obj.flooringCalculator(500, 2.5)); // output: 1250.0
        System.out.println(obj.flooringCalculator(0, 2.5));
        System.out.println(obj.flooringCalculator(0, -1.5));

    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday) || vacation;
    }

    public int diff21(int n) {
        return Math.abs(n-21) + Math.max(0, n-21);
    }

    public double flooringCalculator(int sqft, double pricePerSqft) {
        return Math.max(0,sqft*pricePerSqft);
    }

}
