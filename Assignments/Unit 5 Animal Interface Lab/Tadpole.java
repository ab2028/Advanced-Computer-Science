import java.util.ArrayList;

public class Tadpole extends Animal implements Swimmable {
    // All concrete animals must call this constructor to set up their shared state.
    public Tadpole() {
        super("Tadpole", "Anura", "Ranidae", "Lithobates", "Lithobates catesbeianus",
                "Freshwater ponds and lakes");
    }

    // returns a fact at the index, out of 5 total facts
    @Override
    public String getFact(int index) {
        ArrayList<String> facts = new ArrayList<>();
        facts.add(
                "Although tadpoles grow into frogs as adults, they have gills as babies, but they can also breathe through their skin!");
        facts.add("Tadpoles grow into unicorns when they grow up!");
        facts.add("Tadpoles are mainly herbivores, but some species are cannibalistic carnivores!");
        facts.add("Tadpoles can do taxes!");
        facts.add(
                "Tadpoles have a two chambered heart, but they develop a three chambered heart as they grow into frogs.");
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
        System.out.println("Splash");
    }

    // prints out the sound the animal makes when it eats
    @Override
    public void eat() {
        System.out.println("Nibble");
    }

    // prints out the sound the animal makes when it moves
    @Override
    public void move() {
        System.out.println("Swish");
    }

    // descriptive text versions of the basic behaviors, for displaying in a GUI
    @Override
    public String getSoundDescription() {
        return "A quiet splash of water.";
    }

    @Override
    public String getEatDescription() {
        return "A barely perceptible nibbling and crunching of algae.";
    }

    @Override
    public String getMoveDescription() {
        return "A lateral swishing of the water, barely disturbing the surface.";
    }

    // Swimmable interface methods

    // Basic Characteristics of swimming animals

    // returns the typical swimming speed of the animal in km/h
    @Override
    public double getSwimSpeed() {
        return 0.5;
    }

    // returns the typical depth the animal swims at in meters
    @Override
    public double getPreferredDepth() {
        return 0.7;
    }

    // Basic Behaviors - BE CREATIVE

    // prints out how the animal enters the water
    @Override
    public void enterWater() {
        System.out.println("The tadpole jumps into the water with a splash!");
    }

    // prints out how the animal swims
    @Override
    public void swim() {
        System.out.println("The tadpole wriggles through the water.");
    }

    // prints out how the animal leaves the water
    @Override
    public void exitWater() {
        System.out
                .println("The tadpole grows into a toad and hops out of the water onto the shore.");
    }



}
