public class ShortCircuitEvaluation {
    public static void main(String[] args) {

        String[] names = {"Henry", "Crystal", "Boyan", "Daniel", "Owen", null, "Ava", "Morgan"};

        // count how many students are in the class

        int count = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].length() > 0) { // order of conditions matters! called: short circuit evaluation
                count++; // or use count ++ outside, and if not then subtract instead of using else. in general? only undoable ones / make temp variable
                // and skips if false, or skips if true (first one is)
            } 
        }

        System.out.println(count);

    }
}