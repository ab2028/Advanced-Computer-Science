public class CastingDemo {
    public static void main(String[] args) {

        // implicit casting
        // storing smaller data types into larger ones
        // happens automatically

        int smallNumber = 100;
        long bigNumber = smallNumber; // int to long
        float decimalNumber = bigNumber; // long to float
        double largeDecimal = decimalNumber; // float to double

        // Explicit Casting
        // we're manually converting a data type. usually to a different data type that 
        // may incur data loss

        double pi = 3.14159;
        int engineerPi = (int) pi;
        System.out.println(engineerPi); // truncating - you lost all decimals (permanently)

        long population = 800000000000000L; // if it were 300L you don't always lose data
        int limitedPopulation = (int) population;
        System.out.println(limitedPopulation); // sort of wraps around - is it losing bits?

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        int letterA = 'a';
    
        System.out.println(letterA + 3);

        // there is no implicit or explicit casting between booleans and integers

        // we're not gonna talk about casting object classes
        



    }
}