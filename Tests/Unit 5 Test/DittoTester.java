import java.util.ArrayList;
import javax.sound.sampled.SourceDataLine;

public class DittoTester {



    /**
     * Return an ArrayList of monsters for automated testing. Populate this with your created
     * monsters (e.g. Chimera, custom subclasses).
     */
    public static ArrayList<Monster> gen() {
        ArrayList<Monster> array = new ArrayList<Monster>();
        for (int h = 10; h <=50; h++) {
            for (int a = 10; a <= 50 - h; a++) {
                for (int d = 10; d <= 50 - (a + h); d++) {
                    int s = 50 - a - d - h;
                    Monster m = new Ditto(h, a, d, s);
                    // System.out.println(h + a + d + s);
                    array.add(m);
                }
            }
        }
        return array;
    }


    

    public static void main(String[] args) {


        

        ArrayList<Monster> a = gen();
        int b = 1268;
        Monster monster2 = a.get(b);
        System.out.println(monster2.getHealth() + "  " + monster2.getAttack() + "  " + monster2.getDefense()+ " "+monster2.getSpeed());
        System.out.println(a.size());
        int[] ints = new int[a.size()];
        for (int ind1 = 0; ind1 < a.size(); ind1++) {
            for (int ind2 = 0; ind2 < a.size() && ind2 != ind1; ind2++) {
                Monster m1 = a.get(ind1);
                Monster m2 = a.get(ind2);
                Monster winner = BattleEngine.startBattle(m1, m2);
                if (winner == m1) {
                    ints[ind1] += 1;
                } else {
                    ints[ind2] += 1;
                }
                

            }
            if ((ind1 % 10000) == 0) {
                    System.out.println(ind1);
                }
        }

    

    int biggest = ints[0];
    int biggestindex = 0;

    for (int i = 0; i < ints.length; i++) {
        if (ints[i]>biggest) {
            biggest = ints[i];
            biggestindex = i;
        }
    }


    System.out.println(biggest + "" + biggestindex);

}
}