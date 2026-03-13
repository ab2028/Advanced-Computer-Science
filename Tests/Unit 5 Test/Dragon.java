public class Dragon extends Monster {

    public Dragon(String name) {
        super(name, ElementType.FIRE, 80, 40, 20, 100, "Poison Breath", "Swipe", ElementType.FIRE,
                ElementType.AIR);
    }

    @Override
    public String victoryNoise() {
        return "Roarrrrr!!";
    }

}
