public class Dog {
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;
        this.dogChar = Dog.generateDogChar(dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);        this.stillInFacility = true;
    }

    public Dog() {
        name = "Fido";
        ownerName = "Jane Doe";
        age = 3;
        dogId = 123;
        dogChar = Dog.generateDogChar(dogId);
        dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        stillInFacility = true;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public char getDogChar() {
        return dogChar;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public String getDogTag() {
        return dogTag;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public String toString() {
        return (name + " is a good dog. They are " + age + " years old and belong to " + ownerName
                + ". Are they in our facility? " + stillInFacility
                + ". For employee use only: DogTag is " + dogTag + ".");
    }

    public boolean equals(Dog other) {
        return this.name.equals(other.name) && this.ownerName.equals(other.ownerName)
                && this.age == other.age && this.dogId == other.dogId
                && this.dogChar == other.dogChar && this.dogTag.equals(other.dogTag)
                && this.stillInFacility == other.stillInFacility;
    }


    // sum of digits of ID (3 digits), mod 10, add 'F'.
    public static char generateDogChar(int dogID) { 
        int sum;
        sum = (dogID / 100) + ((dogID / 10) % 10) + (dogID % 10);
        return (char) ('F' + (sum % 10));
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.getOwnerName().equals(personName)) {
            dog.setStillInFacility(false); 
            return dog.getName() + " has been picked up by their owner " + personName + ".";
        } else {
            return dog.getName() + " cannot be picked up by " + personName + ", they are not the owner!";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        dog.setStillInFacility(true);
        dog.setOwnerName(personName);
    }


}



