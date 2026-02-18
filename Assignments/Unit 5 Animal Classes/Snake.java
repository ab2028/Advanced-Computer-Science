
import java.util.ArrayList;

public class Snake extends Animal {
    private String name;
    private ArrayList<String> preyEaten;

    public Snake(String name, int age) {
        this.name = name;
        setAge(age);
        this.preyEaten = new ArrayList<>();
        setAlive(true);
    }

    // getters and setters


    public ArrayList<String> getPreyEaten() {
        return preyEaten;
    }

    public void setPreyEaten(ArrayList<String> preyEaten) {
        this.preyEaten = preyEaten;
    }

    // methods

    public void eat(int value) {
        preyEaten.add("prey" + value);
        System.out.println(name + " has eaten prey worth " + value + " hunger and now has "
                + preyEaten.size() + " prey in its stomach.");
    }

    

    // throw up last prey eaten
    public void throwUp() {
        if (!preyEaten.isEmpty()) {
            preyEaten.remove(preyEaten.size() - 1);
        }
    }


    // game
    public void snakeLottery() {
        while (preyEaten.size() < 5) {
            double rand = Math.random();
            if (rand < 0.8) {
                eat(1);
                preyEaten.add("prey");
            } else {
                throwUp();
                if (preyEaten.isEmpty()) {
                    die();
                    System.out.println(name + " has lost the game.");
                    return;
                }
            }
        }
        System.out.println(name + " has successfully eaten 5 prey!");
    }



}
