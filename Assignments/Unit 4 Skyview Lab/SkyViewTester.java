public class SkyViewTester {
    public static void main(String[] args) {
        double[] scanned = {1, 2, 3, 4, 5, 6};
        SkyView sv = new SkyView(3, 2, scanned);

        System.out.println(sv);
        System.out.println(sv.getAverage(0, 1, 0, 1));
        // 2.5

        SkyView sv2 = new SkyView(3, 2, scanned);
        System.out.println(sv.equals(sv2));
        // true
    }
}
