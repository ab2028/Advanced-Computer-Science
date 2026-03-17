
public class Tester {
    public static void main(String[] args) {

        Monster d = new Dragon("Jean");
        Monster t = new Troll("Tree");
        Monster c = new Chimera("Lead");
        Monster e = new Treant("Root");
        // d.setAttack(234);

        System.out.println(d.getAttack());
        

        BattleEngine.startBattle(t,d);
        // System.out.println(BattleEngine.startBattle(null, null));


        


    }

}
