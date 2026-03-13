public class Troll extends Monster {
    public Troll(String name) {
        super(name, ElementType.EARTH, 80, 40, 20, 100, "Ground Slam", "Downpour",
                ElementType.EARTH, ElementType.WATER);
    }

    @Override
    public String victoryNoise() {
        return "Growllllll!";
    }
}
