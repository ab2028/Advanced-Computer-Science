public class Dolphin extends Animal {
    private String name;
    private int energy;

    public Dolphin(String name, int age) {
        this.name = name;
        setAge(age);
        setAlive(true);
        setHunger(0);
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


    public void eat(int value) {
        setHunger(getHunger() - value);
        System.out.println(name + " successfully ate! Hunger level: " + getHunger()
                + " Energy level: " + energy);
    }

    public void beg() {
        if (getAge() < 2) {
            energy -= 10;
            if (energy <= 0) {
                die();
                return;
            }
            System.out.println(name + " is begging for milk.");
            // random chance (0.8) to get milk, if successful, hunger level decreases
            if (Math.random() < 0.8) {
                eat(20);
                setAge(getAge() + 0.3); // life experience
            } else {
                System.out.println(name + "'s mother refused. Hunger level: " + getHunger()
                        + " Energy level: " + energy);
            }
        } else {
            System.out.println(name + " is too old to beg for milk.");
        }
    }

    public void hunt() {
        if (getAge() >= 2) {
            System.out.println(name + " is hunting for food.");
            energy -= 20;
            if (energy <= 0) {
                die();
                return;
            }
            // random chance (0.6) to successfully hunt, if successful, hunger level decreases
            if (Math.random() < 0.6) {
                eat(30);
                setAge(getAge() + 0.5); // life experience
            } else {
                System.out.println(name + " missed the prey. Hunger level: " + getHunger()
                        + " Energy level: " + energy);
            }
        } else {
            System.out.println(name + " is too young to hunt.");
        }
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
        setHunger(getHunger() + 40);
        if (getHunger() >= 100) {
            die();
        }
        setAge(getAge() + 0.2);
        energy += 50;
        System.out.println(
                name + " woke up. Hunger level: " + getHunger() + " Energy level: " + energy);
    }


}
