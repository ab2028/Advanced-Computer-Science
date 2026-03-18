

public interface ElementalAttacks {


    // Every monster has 2 different attacks, each with different name and type
    // Base damage is based on the monster's attack
    // There is a 45% chance the monster should use AttackOne
    // There is a 45% chance the monster should use AttackTwo
    // There is a 10% chance the monster doubles down and uses BOTH attacks with doubleDown Attack
    // - The double down attack is only available once per battle.
    // - After using double down, the attack probability is 50% / 50% for Attacks 1/2
    default void attack(Monster opponent) {
        if (opponent == null) {
            throw new IllegalArgumentException("Opponent cannot be null!");
        }
        Monster thisMonster = thisMonster();
        double rand = Math.random();
        if (thisMonster.hasUsedDoubleDown()) {
            if (rand < 0.5) {
                thisMonster.performSingleElementalAttack(1, opponent);
            } else {
                thisMonster.performSingleElementalAttack(2, opponent);
            }

        } else {
            if (rand < 0.45) {
                thisMonster.performSingleElementalAttack(1, opponent);
            } else if (rand < 0.90) {
                thisMonster.performSingleElementalAttack(2, opponent);
            } else {
                thisMonster.performDoubleDownAttack(opponent);
            }
        }


    }

    // to-do: Implement the attack method for performSingleElementalAttack
    // The current moster attacks the opponent using the attackNumber provided
    // Inputs:
    // attackNumber: either 1 or 2
    // opponent: the opposing Monster to attack
    default void performSingleElementalAttack(int attackNumber, Monster opponent) {
        if (opponent == null) {
            throw new IllegalArgumentException("Opponent cannot be null!");
        }
        Monster thisMonster = thisMonster();
        ElementType attackElement =
                (attackNumber == 1) ? thisMonster.attackElementOne : thisMonster.attackElementTwo;
        String attackName = (attackNumber == 1) ? thisMonster.attackNameOne : thisMonster.attackNameTwo;

        int baseDamage = 10;
        double STAB = getSTAB(attackElement, thisMonster.getElement());
        double effectivenessMultiplier =
                getElementalMultiplier(attackElement, opponent.getElement());
        int criticalMultiplier = didAttackCrit(thisMonster.getSpeed()) ? 2 : 1;
        int totalDamage = (int) (baseDamage * ((double) thisMonster.getAttack() / opponent.getDefense())
                * STAB * effectivenessMultiplier * criticalMultiplier);
        if (totalDamage == 0) {
            totalDamage = 1;
        }
        // System.out.println("" + baseDamage + "atk" + thisMonster.getAttack() + "def" + opponent.getDefense() + "st?" + STAB + "eff?" + effectivenessMultiplier + "crit" + criticalMultiplier);

        opponent.takeDamage(totalDamage);
        // System.out.println(thisMonster.getName() + " used " + attackName + "! " + getEffectiveMessage(attackElement, opponent.getElement()));
        // if (criticalMultiplier == 2) {
        //     System.out.println("It was a critical hit!");
        // }
    }

    static String getEffectiveMessage(ElementType attackType, ElementType opponentType) {
        if (isSuperEffectiveAgainst(attackType, opponentType)) {
            return "It was super effective!";
        } 
        if (isSuperEffectiveAgainst(opponentType, attackType)) { // switch 
            return "It was not very effective...";
        }
        return "";
    }


    

    static double getSTAB(ElementType attackType, ElementType monsterType) {
        
        if (attackType == monsterType) {
            return 1.5;
        }
        return 1;
    }


    // to-do: Implement the useDoubleDown() method for the monster
    // This method is called when the monster uses their double down attack.
    // The double down attack is only available once per battle
    // If the monster has already used their double down attack, print a message saying so and
    // return. The
    // monster effectively loses their turn.
    default void performDoubleDownAttack(Monster opponent) {
        if (opponent == null) {
            throw new IllegalArgumentException("Opponent cannot be null!");
        }
        Monster thisMonster = thisMonster();
        if (thisMonster.hasUsedDoubleDown()) {
            System.out.println("Already used this attack.");
            return;
        }
        thisMonster.performSingleElementalAttack(1, opponent);
        // System.out.println(thisMonster.getName() + " doubled down!");
        thisMonster.performSingleElementalAttack(2, opponent);
        thisMonster.useDoubleDown();
    }

    /**
     * didAttackCrit returns a boolean if an attack critically struck based on the speed of the
     * attacking monster
     */
    public static boolean didAttackCrit(int speed) {
        if (speed <= 0)
            return false;
        if (speed >= 250)
            return true;
        return Math.random() < (speed / 250.0);
    }


    /**
     * Returns true if attackType is super effective against defenderType. Fire->Air, Air->Earth,
     * Earth->Water, Water->Fire
     */
    static boolean isSuperEffectiveAgainst(ElementType attackType, ElementType defenderType) {
        if (attackType == null || defenderType == null)
            return false;
        return (attackType == ElementType.FIRE && defenderType == ElementType.AIR)
                || (attackType == ElementType.AIR && defenderType == ElementType.EARTH)
                || (attackType == ElementType.EARTH && defenderType == ElementType.WATER)
                || (attackType == ElementType.WATER && defenderType == ElementType.FIRE);
    }

    /**
     * Returns the effectiveness multiplier: 2.0 (super), 1.0 (normal), or 0.5 (low).
     */
    static double getElementalMultiplier(ElementType attackType, ElementType defenderType) {
        if (attackType == null || defenderType == null)
            return 1.0;
        if (isSuperEffectiveAgainst(attackType, defenderType))
            return 2.0;
        if ((attackType == ElementType.FIRE
                && (defenderType == ElementType.WATER || defenderType == ElementType.FIRE))
                || (attackType == ElementType.WATER
                        && (defenderType == ElementType.EARTH || defenderType == ElementType.WATER))
                || (attackType == ElementType.EARTH
                        && (defenderType == ElementType.AIR || defenderType == ElementType.EARTH))
                || (attackType == ElementType.AIR
                        && (defenderType == ElementType.FIRE || defenderType == ElementType.AIR)))
            return 0.5;
        return 1.0;
    }

    // Using this to get the Monster.
    // You can use: (Monster) this
    // or: Monster thisMonster = thisMonster();
    private Monster thisMonster() {
        if (!(this instanceof Monster)) {
            throw new IllegalStateException("ElementalAttack implementations must be Monsters");
        }
        return (Monster) this;
    }
}
