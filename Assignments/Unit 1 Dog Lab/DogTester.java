public class DogTester {
    public static void main(String[] args) {
        // Create Dog objects
        Dog dog1 = new Dog("Buddy", "Alice", 5, 123);
        Dog dog2 = new Dog();
        Dog dog3 = new Dog("Max", "DOGGGGG", 4, 693);

        // Print initial values
        System.out.println("Initial Values:");
        
        // Test getters
        System.out.println(dog1.getName() + " " + dog1.getOwnerName() + " " + dog1.getAge() + " " + dog1.getDogId() + " " + dog1.getDogChar() + " " + dog1.getDogTag() + " " + dog1.isStillInFacility()); 
        System.out.println(dog2.getName() + " " + dog2.getOwnerName() + " " + dog2.getAge() + " " + dog2.getDogId() + " " + dog2.getDogChar() + " " + dog2.getDogTag() + " " + dog2.isStillInFacility());
        System.out.println(dog3.getName() + " " + dog3.getOwnerName() + " " + dog3.getAge() + " " + dog3.getDogId() + " " + dog3.getDogChar() + " " + dog3.getDogTag() + " " + dog3.isStillInFacility());
      


        // Test setters
        dog1.setAge(6);
        dog2.setName("Charlie");
        dog2.setOwnerName("Eve");

        // Print updated values
        System.out.println(dog1);
        System.out.println(dog2);

        // Test specialized methods
        System.out.println("Dog 1 Char: " + dog1.generateDogChar());
        System.out.println("Dog 3 Char: " + dog3.generateDogChar());
        System.out.println("Dog 1 Tag: " + dog1.generateDogTag());
        System.out.println("Dog 2 Tag: " + dog2.generateDogTag());
        System.out.println("Dog 3 Tag: " + dog3.generateDogTag());

        // Test equals method
        Dog dog4 = new Dog("Buddy", "Alice", 6, 123);
        System.out.println("dog1 equals dog3: " + dog1.equals(dog3)); 
        System.out.println("dog1 equals dog4: " + dog1.equals(dog4));

        // Test edge case for stillInFacility
        dog1.setStillInFacility(false);
        System.out.println(dog1);
    }
    
}
