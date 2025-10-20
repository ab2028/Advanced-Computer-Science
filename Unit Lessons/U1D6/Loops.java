public class Loops {
    // while loops are used when we don't know how many iterations (/repetitions) something has
    // but what functionality does it gain/lose over for
    // an external condition aside from just on the variable of iteration?
    // more of a matter of which one is best
        public static void main(String[] args) {

            int count = 0;
            while (count < 10) {

                System.out.println(count);
                count++;
            }
        

            boolean isRunning = true;
            while (isRunning) {
                count++;
                if (count == 100) {
                    isRunning = false;
                }
            }

            for (int count2 = 0; count2 < 10; count2++) {
                System.out.println(count2);
            }

            // just readability?
            // easier to get inf loop for while loop
            // while loops require initialization outside of the loop, iterator updated inside loop (..vs for loop? syntax is more compact)



            // loop 4 - dowhile loops
            do { // this is run at least once - check the condition to loop again (second and etc)
                System.out.println("do this first");
                System.out.println("them check conditions");

            } while (isRunning);

            // loop 5 - "dowhile" ?
            // while loops are not required for this class or ap
            System.out.println("do this first");
            System.out.println("them check conditions");

            while (isRunning) {
                System.out.println("do this first");
                System.out.println("them check conditions");
            }

            // loop 6 
            // exponential increase of time complexity - at most two nested for loops!
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.println("All work and no play makes jack a dull boy");
                }
            }

            // you can also nest while loops but this is not as good practice as nesting for loops
            // how does the logic work?

        }
}