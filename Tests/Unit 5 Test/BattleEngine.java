// a class for all of the battle engine functions
// this class will be used to validate the type, element, weakness, health, and attack of the
// monsters
// there's also methods that will be used to calculate the damage and the health of the monsters
// and apply the type advantage multipliers

public class BattleEngine {


    // checks if the monster stats are valid
    // the total combined stats of the monster should not exceed 250
    public static boolean validateStats(Monster monster) {
        if (monster.getHealth() < 0 || monster.getSpeed() < 0 || monster.getAttack() < 0
                || monster.getDefense() < 0) {
            return false;
        }
        return monster.getHealth() + monster.getSpeed() + monster.getDefense()
                + monster.getAttack() <= 250;
    }

    // checks if the monster element is valid
    // the only valid types allowed are "Fire", "Water", "Earth", and "Air"
    public static boolean validateElement(Monster monster) {
        boolean res = monster.getElement() == ElementType.FIRE
                || monster.getElement() == ElementType.EARTH
                || monster.getElement() == ElementType.WATER
                || monster.getElement() == ElementType.AIR;
        if (!res) {
            monster.setElement(ElementType.FIRE);
        }
        return res;
    }

    // checks if stats are invalid
    // fixes them so they are valid, however you choose
    public static void correctStats(Monster monster) {
        if (!validateStats(monster)) {
            monster.setAttack(30);
            monster.setDefense(30);
            monster.setSpeed(30);
            monster.setHealth(30);
        }
    }

    // each monster takes turn attacking the other until a monster's hp reaches 0. It returns the
    // winning monster.
    public static Monster startBattle(Monster monster1, Monster monster2) {
        if (monster1 == null) {
            return win(monster2);
        }
        if (monster2 == null) {
            return win(monster1);
        }
        // if both are null it will return null automatically
        Monster starting = chooseStarting(monster1, monster2);
        Monster defending;
        Monster temp;
        if (starting == monster1) {
            defending = monster2;
        } else {
            defending = monster1;
        }
        while (starting.getHealth() > 0) {
            starting.attack(defending);
            displayStatus(monster1, monster2);
            temp = starting;
            starting = defending;
            defending = temp;
        }
        // loop will end when starting health = 0
        return win(defending);



    }

    public static Monster win(Monster monster) {
        System.out.println(monster.getName() + " won the battle!");
        System.out.println(monster.victoryNoise());
        return monster;
    }

    public static Monster chooseStarting(Monster monster1, Monster monster2) {
        if (monster1.getSpeed() > monster2.getSpeed()) {
            return monster1;
        }
        if (monster1.getSpeed() < monster2.getSpeed()) {
            return monster2;
        } else {
            double rand = Math.random();
            if (rand < 0.5) {
                return monster1;
            } else {
                return monster2;
            }
        }
    }



    // method prints out the current health of each monster.
    public static void displayStatus(Monster monster, Monster opponent) {
        System.out.println(monster.getName() + " has health " + monster.getHealth() + " and "
                + opponent.getName() + " has health " + opponent.getHealth() + ".");
    }

}
