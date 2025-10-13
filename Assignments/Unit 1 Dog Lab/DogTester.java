public class DogTester {
    public static void main(String[] args) {
        // Create Dog objects
        Dog dog1 = new Dog("DOGGGGG", "Alice", 5, 123);
        Dog dog2 = new Dog();
        Dog dog3 = new Dog("Cat", "John", 4, 693);

        // Print initial values
        System.out.println("Initial Values:");

        // Test getters
        System.out.println(dog1.getName() + " " + dog1.getOwnerName() + " " + dog1.getAge() + " "
                + dog1.getDogId() + " " + dog1.getDogChar() + " " + dog1.getDogTag() + " "
                + dog1.isStillInFacility());
        System.out.println(dog2.getName() + " " + dog2.getOwnerName() + " " + dog2.getAge() + " "
                + dog2.getDogId() + " " + dog2.getDogChar() + " " + dog2.getDogTag() + " "
                + dog2.isStillInFacility());
        System.out.println(dog3.getName() + " " + dog3.getOwnerName() + " " + dog3.getAge() + " "
                + dog3.getDogId() + " " + dog3.getDogChar() + " " + dog3.getDogTag() + " "
                + dog3.isStillInFacility());



        // Test setters
        dog1.setAge(6);
        dog2.setName("Charlie");
        dog2.setOwnerName("Eve");

        // Print updated values
        System.out.println(dog1);
        System.out.println(dog2);

        // Test specialized methods
        System.out.println("Dog 1 Char: " + PawesomeUtils.generateDogChar(123));
        System.out.println("Dog 3 Char: " + PawesomeUtils.generateDogChar(693));
        System.out.println(
                "Dog 1 Tag: " + PawesomeUtils.generateDogTag(dog1.getDogId(), dog1.getDogChar()));
        System.out.println(
                "Dog 2 Tag: " + PawesomeUtils.generateDogTag(dog2.getDogId(), dog2.getDogChar()));
        System.out.println(
                "Dog 3 Tag: " + PawesomeUtils.generateDogTag(dog3.getDogId(), dog3.getDogChar()));

        // Test equals method
        Dog dog4 = new Dog("DOGGGGG", "Alice", 6, 123);
        System.out.println("dog1 equals dog3: " + dog1.equals(dog3));
        System.out.println("dog1 equals dog4: " + dog1.equals(dog4));

        // Test edge case for stillInFacility
        dog1.setStillInFacility(false);
        System.out.println(dog1);

        // Test static pickup() method
        System.out.println(PawesomeUtils.pickup(dog1, "Alice"));
        System.out.println("dog1 (DOGGGGG) still in facility? " + dog1.isStillInFacility());
        System.out.println(PawesomeUtils.pickup(dog1, "John"));
        System.out.println("dog1 (DOGGGGG) still in facility? " + dog1.isStillInFacility());

        // Test static checkIn() method
        Dog goodDog = new Dog();
        goodDog.setStillInFacility(false);
        System.out.println("goodDog (Fido) still in facility? " + goodDog.isStillInFacility());
        PawesomeUtils.checkIn(goodDog, "John");
        System.out.println("goodDog (Fido) still in facility? " + goodDog.isStillInFacility());
        System.out.println("goodDog (Fido)'s new owner: " + goodDog.getOwnerName());

        // Test validateDogId method
        System.out.println(PawesomeUtils.validateDogId(50));
        System.out.println(PawesomeUtils.validateDogId(100));
        System.out.println(PawesomeUtils.validateDogId(562));
        System.out.println(PawesomeUtils.validateDogId(999));
        System.out.println(PawesomeUtils.validateDogId(1000));

        // Test validateDogTag method
        Dog dogA = new Dog("TestDog", "Bob", 1, 150);
        Dog dogB = new Dog("TestDog", "Jack", 2, 85); // Invalid ID
        Dog dogC = new Dog("TestDog", "Julia", 5, 999);

        System.out.println(PawesomeUtils.validateDogTag(dogA));
        System.out.println(PawesomeUtils.validateDogTag(dogB));
        System.out.println(PawesomeUtils.validateDogTag(dogC));

        // Test checkIn with counterfeit dog
        Dog counterfeitDog = new Dog("FakeDog", "Eve", 3, 200);
        counterfeitDog.setDogTag("999Z"); // Invalid tag
        PawesomeUtils.checkIn(counterfeitDog, "Eve");

        // Test age conversion methods

        System.out.println("Dog A age in human years: " + PawesomeUtils.convertAgeToHumanAge(dogA));
        System.out.println("Dog B age in human years: " + PawesomeUtils.convertAgeToHumanAge(dogB));
        System.out.println("Dog C age in human years: " + PawesomeUtils.convertAgeToHumanAge(dogC));

        System.out.println("Human age 10 in dog years: " + PawesomeUtils.convertAgeToDogYears(10));
        System.out.println("Human age 25 in dog years: " + PawesomeUtils.convertAgeToDogYears(25));
        System.out.println("Human age 50 in dog years: " + PawesomeUtils.convertAgeToDogYears(50));



    }

}
