

public class RedPanda extends Animal {

    // eat no longer needs to be abstract; defined here
    // just as different objects may have shared instance variables (static), different classes can have shared methods
    public void eat() {
        System.out.println("I am eating");
    }

}
