

public class Snake extends Animal {

    public Snake(String name, int age, double weight, int speed) {
        setName(name);
        setAge(age);
        setHunger(0);
        setAlive(true);
        setWeight(weight);
        setSpeed(speed);
    }

    public Snake() {
        setName("Anonymous Snake");
        setAge(0);
        setHunger(0);
        setAlive(true);
        setWeight(4.0);
        setSpeed(18);
    }

    // getters and setters


    // methods
    @Override
    public void feed() {
        hunger += 1;
        System.out.println(getName() + " has eaten prey worth 1 hunger and now has " + getHunger()
                + " prey in its stomach.");
    }



    // throw up last prey eaten
    public void throwUp() {
        if (hunger > 0) {
            hunger -= 1;
        }
    }


    // game
    public void snakeLottery() {
        while (hunger < 5) {
            double rand = Math.random();
            if (rand < 0.8) {
                feed();
            } else {
                throwUp();
                if (hunger <= 0) {
                    die();
                    System.out.println(getName() + " has lost the game.");
                    return;
                }
            }
        }
        System.out.println(getName() + " has successfully eaten 5 prey!");
    }

    @Override
    public String toString() {
        return getName() + " is a snake, age: " + getAge() + ", hunger: " + getHunger()
                + ", alive: " + isAlive() + ", weight: " + getWeight() + ", speed: " + getSpeed();
    }



}
