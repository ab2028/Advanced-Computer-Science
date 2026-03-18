public class Ditto extends Monster {

    public Ditto(int health, int attack, int defense, int speed) {
        // health atk def speed
        super("ditto", ElementType.EARTH, health, attack, defense, speed, "", "", ElementType.FIRE,
                ElementType.FIRE);
    }

    @Override
    public String victoryNoise() {
        return "WINNER DITTO HAS STATS health, attack, defense, speed: " + health + " " + attack + " " + defense + " " + speed;
    }

}
