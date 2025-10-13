public class Dog {

    // Instance Variables
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    // Constructors

    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = PawesomeUtils.validateDogId(dogId);
        this.dogChar = PawesomeUtils.generateDogChar(dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        this.stillInFacility = true;
    }

    public Dog() {
        name = "Fido";
        ownerName = "Jane Doe";
        age = 3;
        dogId = 123;
        dogChar = PawesomeUtils.generateDogChar(dogId);
        dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        stillInFacility = true;

    }

    // Getters


    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getAge() {
        return age;
    }

    public int getDogId() {
        return dogId;
    }

    public char getDogChar() {
        return dogChar;
    }

    public String getDogTag() {
        return dogTag;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDogId(int dogId) {
        if (dogId <= 100 || dogId >= 999) {
            dogId = PawesomeUtils.validateDogId(dogId);
        }
        this.dogId = dogId;
        this.dogChar = PawesomeUtils.generateDogChar(dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);   
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }


    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    // Inherited methods (equals and toString)

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



}


