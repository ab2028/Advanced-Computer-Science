public class NPC {
    private String choice;

    public NPC() {
        choice = RPSGame.generateRandomChoice();
    }


    public String toString() {
        return "Opponent chose " + this.choice + ".";
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }



}