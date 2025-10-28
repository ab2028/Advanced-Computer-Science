public class CatTester {
    public static void main(String[] args) {
        
        Cat dog = new Cat("dogggg", "Alice", 5, "1234");

        // testing setters
        dog.setCatId("9999");
        dog.setMoodLevel(15);
        dog.setName("dogggg");
        dog.setOwnerName("Alice");

        // testing equals

        Cat dog2 = new Cat("dogggg", "Alice", 10, "9999");


        System.out.println(dog.equals(dog2));

        // testing bootUp

        PurrfectUtils.bootUp(dog);

        // testing pet
        PurrfectUtils.pet(dog);

        // testing trimClaws x4

        for (int i = 0; i < 4; i++) {
            PurrfectUtils.trimClaws(dog);
        }

        // testing cleanLitterBox
        PurrfectUtils.cleanLitterBox(dog);

        // testing feed
        PurrfectUtils.feed(dog);



    }

}
