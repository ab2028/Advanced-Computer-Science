public class Dolphin extends Animal {
    private int energy;

    public Dolphin(String name, int age, double weight, int speed) {
        setName(name);
        setAge(age);
        setHunger(100);
        setAlive(true);
        setWeight(weight);
        setSpeed(speed);
        this.energy = 100;
    }

    public Dolphin() {
        setName("Anonymous Dolphin");
        setAge(0);
        setHunger(100);
        setAlive(true);
        setWeight(450.0);
        setSpeed(6);
        this.energy = 100;
    }

    // getters and setters

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    // methods

    @Override
    public void feed() {
        setHunger(getHunger() - 20);
        System.out.println(getName() + " successfully ate! Hunger level: " + getHunger()
                + " Energy level: " + energy);
    }

    public void beg() {
        if (getAge() < 2) {
            energy -= 10;
            if (energy <= 0) {
                die();
                return;
            }
            System.out.println(getName() + " is begging for milk.");
            // random chance (0.8) to get milk, if successful, hunger level decreases
            if (Math.random() < 0.8) {
                feed();
                setAge(getAge() + 0.3); // life experience
            } else {
                System.out.println(getName() + "'s mother refused. Hunger level: " + getHunger()
                        + " Energy level: " + energy);
            }
        } else {
            System.out.println(getName() + " is too old to beg for milk.");
        }
    }

    public void hunt() {
        if (getAge() >= 2) {
            System.out.println(getName() + " is hunting for food.");
            energy -= 20;
            if (energy <= 0) {
                die();
                return;
            }
            // random chance (0.6) to successfully hunt, if successful, hunger level decreases
            if (Math.random() < 0.6) {
                feed();
                setAge(getAge() + 0.5); // life experience
            } else {
                System.out.println(getName() + " missed the prey. Hunger level: " + getHunger()
                        + " Energy level: " + energy);
            }
        } else {
            System.out.println(getName() + " is too young to hunt.");
        }
    }

    public void sleep() {
        System.out.println(getName() + " is sleeping.");
        setHunger(getHunger() + 40);
        if (getHunger() >= 100) {
            die();
        }
        setAge(getAge() + 0.2);
        energy += 50;
        System.out.println(
                getName() + " woke up. Hunger level: " + getHunger() + " Energy level: " + energy);
    }

    @Override
    public String toString() {
        return getName() + " is a dolphin, age: " + getAge() + ", hunger: " + getHunger()
                + ", alive: " + isAlive() + ", weight: " + getWeight() + ", speed: " + getSpeed()
                + " Energy level: " + energy;
    }

}
