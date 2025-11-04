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
        choice = choice.toLowerCase();
        if (RPSGame.validateChoice(choice) == false) {
            this.choice = RPSGame.generateRandomChoice();
        } else {
            this.choice = choice;
        }
    }



}