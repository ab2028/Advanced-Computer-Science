public class Utils {
    public static int generateRandomNumberBetween(int low, int high) { // inclusive low, exclusive high
        return (int) (Math.random() * (high - low)) + low;
    }
}