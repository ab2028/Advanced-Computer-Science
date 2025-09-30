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
        this.dogChar = generateDogChar();
        this.dogTag = generateDogTag();
        this.stillInFacility = true;
    }

    public Dog() {
        name = "Fido";
        ownerName = "Jane Doe";
        age = 3;
        dogId = 123;
        dogChar = generateDogChar();
        dogTag = generateDogTag();
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

    public String generateDogTag() {
        return "" + dogId + dogChar;
    }

    // sum of digits of ID (3 digits), mod 10, add 'F'.
    public char generateDogChar() { 
        int sum;
        sum = (dogId / 100) + ((dogId / 10) % 10) + (dogId % 10);
        return (char) ('F' + (sum % 10));
    }


}

