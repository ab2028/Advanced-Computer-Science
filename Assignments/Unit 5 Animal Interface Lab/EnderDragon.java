import java.util.ArrayList;

public class EnderDragon extends Animal implements Flyable, Predator {
    // All concrete animals must call this constructor to set up their shared state.
    public EnderDragon(String name, String order, String family, String genus, String species,
            String habitat) {
        super(name, order, family, genus, species, habitat);
    }

    // returns a fact at the index, out of 5 total facts
    @Override
    public String getFact(int index) {
        ArrayList<String> facts = new ArrayList<>();
        facts.add("The Ender Dragon's real name is Jean!");
        facts.add(
                "The Ender Dragon is the only mob that cannot be named with a name tag in Minecraft.");
        facts.add("The Ender Dragon is immune to poison, wither, and void damage.");
        facts.add("The Ender Dragon flies at 10 times the player's walking speed.");
        facts.add(
                "The Ender Dragon has the longest death sound of any mob in Minecraft, lasting 10 seconds.");
        return facts.get(index);

    }

    // returns a random fact (out of 5) of the animal
    @Override
    public String getFact() {
        int index = (int) (Math.random() * 5);
        return getFact(index);
    }

    // Basic Behaviors - BE CREATIVE

    // prints out the sound the animal makes
    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }

    // prints out the sound the animal makes when it eats
    @Override
    public void eat() {
        System.out.println("Crunch crunch");
    }

    // prints out the sound the animal makes when it moves
    @Override
    public void move() {
        System.out.println("Flap flap");
    }

    // descriptive text versions of the basic behaviors, for displaying in a GUI
    @Override
    public String getSoundDescription() {
        return "A low rumbling roar that shakes the ground.";
    }

    @Override
    public String getEatDescription() {
        return "A loud crunching sound of bones breaking and meat tearing.";
    }

    @Override
    public String getMoveDescription() {
        return "The sound of wings flapping and air rushing.";
    }

    // Flyable interface methods

    // Basic Characteristics of flying animals

    // returns the typical flight speed of the animal in km/h
    public double getFlightSpeed() {
        return 0.7;
    }

    // returns the maximum altitude the animal can reach in meters
    public double getMaxAltitude() {
        return 256;
    }

    // Basic Behaviors - BE CREATIVE

    // prints out how the animal takes off
    public void takeOff() {
        System.out.println(
                "The Ender Dragon propells itself into the air with a powerful leap and flap of its wings.");
    }

    // prints out how the animal flies
    public void fly() {
        System.out.println(
                "The Ender Dragon flaps its wings slowly and powerfully, flying in circles around the player, swooping down to attack.");
    }

    // prints out how the animal lands
    @Override
    public void land() {
        System.out.println(
                "The Ender Dragon descends, flapping its wings quickly, landing with a loud thud.");
    }

    // Predator interface methods

    // Basic Characteristics of predators

    // returns the primary type of prey this predator hunts
    public String getPrimaryPrey() {
        return "Players and Endermen";
    }

    // returns the typical size of prey in kilograms
    public double getAveragePreyMass() {
        return 60.0;
    }

    // Basic Behaviors - BE CREATIVE

    // prints out how the animal stalks its prey
    public void stalkPrey() {
        System.out
                .println("The Ender Dragon circles high above, watching for players and Endermen.");
    }

    // prints out how the animal attacks its prey
    public void attackPrey() {
        System.out.println(
                "The Ender Dragon swoops down, breathing projectiles of purple fire that damages and knocks back its prey.");
    }

    // prints out how the animal eats its prey
    public void eatPrey() {
        System.out.println(
                "The Ender Dragon bites into its prey, tearing them apart with its powerful jaws.");
    }
}
