
public class Tester {
    public static void main(String[] args) {

        Monster d = new Dragon("Jean");
        Monster t = new Troll("Tree");

        System.out.println(BattleEngine.startBattle(d, t));

    }

}
