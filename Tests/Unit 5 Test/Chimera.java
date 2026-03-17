public class Chimera extends Monster {
    // constructors
    public Chimera(String name) {
        super(name, ElementType.FIRE, 50, 50, 10, 140, "Pepper Breath", "Deathly Scream",
                ElementType.FIRE, ElementType.AIR);
    }


    // methods
    @Override
    public String victoryNoise() {
        return name + " screeches in glee!";
    }
}
