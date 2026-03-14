public class Troll extends Monster {
    public Troll(String name) {
        super(name, ElementType.EARTH, 100, 30, 70, 30, "Ground Slam", "Downpour",
                ElementType.EARTH, ElementType.WATER);
    }

    @Override
    public String victoryNoise() {
        return "Growllllll!";
    }
}
