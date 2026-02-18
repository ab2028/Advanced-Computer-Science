public class DolphinTester {
    public static void main(String[] args) {
        Dolphin babyDolphin = new Dolphin("h", 1);
        babyDolphin.beg(); // should be able to beg for milk
        babyDolphin.hunt(); // should be too young to hunt
        babyDolphin.sleep(); // should sleep and gain energy

        Dolphin adultDolphin = new Dolphin("d", 3);
        adultDolphin.beg(); // should be too old to beg for milk
        adultDolphin.hunt(); // should be able to hunt for food
        adultDolphin.sleep(); // should sleep and gain energy

        // die
        for (int i = 0; i < 30; i++) {
            babyDolphin.beg(); // eventually should die of exhaustion
        }
    }
    
}
