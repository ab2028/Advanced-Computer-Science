public class Robot {

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    public Robot(int[] hallwayToClean, int startingPosition) {
        this.hallway = validateHallway(hallwayToClean);
        this.position = validatePos(startingPosition);
        isFacingRight = true;
    }

    public int[] validateHallway(int[] hallway) {
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] < 0) {
                hallway[i] = 0;
            }
        }
        return hallway;
    }



    public int validatePos(int position) {
        if (position >= hallway.length) {
            position = hallway.length - 1;
        }
        if (position < 0) {
            position = 0;
        }
        return position;
    }

    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        return (isFacingRight && position == hallway.length - 1)
                || (!isFacingRight && position == 0);
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        if (hallway[position] > 0) { // take until depleted
            hallway[position]--;
        }
        if (hallway[position] == 0) { // once depleted, move/turn
            if (isRobotBlockedByWall()) { // turn if blocked
                isFacingRight = !isFacingRight;
                return;
            } // otherwise move in the correct direction
            if (isFacingRight) {
                position++;
            } else {
                position--;
            }
        }


    }

    /**
     * This method displays the current state of the robot and the hallway. It then calls the move()
     * method and counts the number of moves it takes to clear the hallway. The method should
     * display the current state of the robot after each move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;
        // to-do: implement this method
        while (!hallIsClear() && count <= 10) {
            move();
            displayState();
            count++;
        }

        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        // to-do: implement this method
        for (int i = 0; i < hallway.length; i++) {
            if (!(hallway[i] == 0)) {
                return false;
            }
        }
        return true;
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        // to-do: implement this method
        for (int i = 0; i < hallway.length; i++) {
            System.out.print(hallway[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < 2 * position; i++) {
            System.out.print(" ");
        }
        System.out.println(">");


    }

    public int[] getHallway() {
        return hallway;
    }

    public void setHallway(int[] hallway) {
        this.hallway = validateHallway(hallway);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = validatePos(position);
    }

    public boolean isFacingRight() {
        return isFacingRight;
    }

    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }
}
