public abstract class Animal {

    // common instance variables
    private double age;
    private boolean isAlive;
    private String name;
    private int hunger;

    // common abstract methods
    public abstract void eat(int value);

    public void die() {
        setAlive(false);
        System.out.println(name + " has died.");
    }

    // getters and setters

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHunger() {
        if (hunger < 0) {
            hunger = 0;
        }
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }



}
