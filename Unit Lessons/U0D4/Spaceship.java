// camelCase -> a way to write variable names (specifically in java), and it's a standard
// A
// thefoxjumpedoverthelazydog

// B
// TheFoxJumpedOverTheLazyDog
// keep the first letter lowercase if it's a variable name or method
// otherwise keep it uppercase (capital) for class names

// a class is just a blueprint for a new data type (a blueprint is not a house; the house is the instance; we have to create the house!)
// -> it's not the object itself, but rather a plan 
public class Spaceship {

    // instance variables
    private String description; // null is different than an empty string - cannot "act" like a string (concatenation, etc?). like it doesn't exist versus it's empty/we don't know (?)
    private int passengerCount;
    private double fuelLevel;
    private boolean shieldsActive;


    // constructors () // arguments vs/or parameters?
    public Spaceship(String inputDescription, int inputPassengerCount, double inputFuelLevel, boolean inputShieldsActive) {
        description = inputDescription;
        passengerCount = inputPassengerCount;
        fuelLevel = inputFuelLevel;
        shieldsActive = inputShieldsActive;

    }

    // methods 
    // getters (aka accessors)
    
    public String getDescription(){
        return description;
    }

    public int getPassengerCount(){
        return passengerCount;
    }

    public double getFuelLevel(){
        return fuelLevel;
    }

    public boolean getShieldsActive() {
        return shieldsActive;
    }

    // setters (# should match # of getters/vars) (thesemethods are void)
    public void setDescription(String input){
        description = input;
    }

    public void setPassengerCount(int input) {
        passengerCount = input;
    }

    public void setFuelLevel(double input) {
        fuelLevel = input;

    }

    public void setShieldsActive(boolean input) {
        shieldsActive = input;
    }


    // challenge: use 3 setters to update the values of 3 different instance variables, make sure to print before and after the update.





}