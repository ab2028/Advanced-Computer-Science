public class CatTester {
    public static void main(String[] args) {
        Cat myCat = new Cat("Betsy", "Tabby"); // 1. Added "new" before Cat(..) (x2)
        Cat otherCat = new Cat("Tiger Beast", "Tabby");
        System.out.println(myCat.toString());
        System.out.println("My Cat's Name: " + myCat.getName()); // 2. Added System.out.println

        System.out.println("Are the cats equal? " + myCat.equals(otherCat)); // 3. Changed return to System.out.println, added space after "?", changed cat's to cats.

        System.out.println("Is my cat hungry? " + myCat.getIsHungry()); // 4. Changed print to System.out.println

        String firstName = "Tiger";
        String lastName = "Beast"; // 5. Changed == to =
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cats are the same now: " + myCat.equals(otherCat)); // 6. Changed cat's to cats.

    }

}