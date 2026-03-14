public class Dragon extends Monster {

    public Dragon(String name) {
        // health atk def speed
        super(name, ElementType.FIRE, 90, 50, 30, 80, "Poison Breath", "Swipe", ElementType.FIRE,
                ElementType.AIR);
    }

    @Override
    public String victoryNoise() {
        return "Roarrrrr!!";
    }

}
