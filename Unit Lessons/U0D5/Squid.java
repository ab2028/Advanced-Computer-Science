public class Squid {
    // instance variables
    private int tentacleCount;
    private double inkMeter;
    private String funFact;


    // constructors
    // default constructor
    public Squid() {
        tentacleCount = 10;
        inkMeter = 100.0;
        funFact = "You can use pieces of squid as fish bait!";
    }
    
    public int getTentacleCount() {
        return tentacleCount;
    }

    public void setTentacleCount(int value) { //order of i,c,g,s? colors?
        tentacleCount = value;
    }

    // a built in method that returns all of the values of an object in a nice sentence
    public String toString() {
        return "This is a squid. It has " + tentacleCount + " tentacles, and its current ink level is " + inkMeter + ". Also, did you know that " + funFact + "?";
    }

    public boolean equals(Squid other) {
        return (tentacleCount == other.tentacleCount && inkMeter == other.inkMeter && funFact.equals(other.funFact)); // we don't need getters because they are inside the same class. a private member of a class can only be accessed inside the same class in which it's declared

    }



}
