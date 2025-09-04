public class Zombie {

    // instance variables (attributes)
    // green
    String skinColor = "Green";
    // rot and dead
    boolean isDead = true;
    // humans eaten count
    int humansEaten = 0; // how to set this separately for each zombie?



    // main
    public static void main(String[] args) {
        Zombie phillip = new Zombie();

        phillip.growl(); // inside main
        System.out.println(phillip.growl()); // need to print - not just return!
        // alternative - sout + enter auto types

        Zombie brian = new Zombie();

        brian.growl();

        System.out.println("Phillip ate " + phillip.humansEaten() + " humans.");

        System.out.println(brian.humansEaten());

        brian.eatHuman();
        System.out.println(brian.humansEaten());

        brian.feast(14);
        System.out.println(brian.humansEaten());

    }


    // methods (behaviours)
    // walk with arms out
    // growl
    public String growl() {
        return "grrrsssaaaaajlhhhhh...";
    }
    // eat brains

    // Challenge: make a new method that returns the number of humans eaten

    public int humansEaten() { // can also name method and attribute same thing - humansEaten is
                                  // ok - is this good practice? typically: gethumansEaten
        return humansEaten;
    }

    public void eatHuman() {
        humansEaten++;
    }

    public void feast(int humanCount) {
        humansEaten += humanCount;
    }
}
