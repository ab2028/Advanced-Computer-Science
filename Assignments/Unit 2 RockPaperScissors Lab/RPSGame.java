import java.util.Scanner;

public class RPSGame {
    private Player player;
    private NPC opponent;

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public void start() {
        /*
         * This method initializes a Scanner object and prompts the user for their name and choice.
         * If the user's choice is invalid, they get two more attempts. After three failed attempts,
         * the program assigns a random choice and notifies the user. Once a valid name and choice
         * are obtained, the method updates the player object's name and choice instance variables.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        String choice = "";
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            choice = scanner.nextLine().toLowerCase();
            if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
                attempts++;
            }
        }
        if (attempts == 3) {
            choice = generateRandomChoice();
            System.out.println("Too many invalid attempts. Your choice has been set to: " + choice);
        }
        player.setName(name);
        player.setChoice(choice);
    }

    public void setPlayerValues(String name, String choice) {
        player.setName(name);
        player.setChoice(choice);
    }

    public boolean didPlayerWin() {
        String p = player.getChoice();
        String o = opponent.getChoice();
        return (p.equals("rock") && o.equals("scissors")) || (p.equals("paper") && o.equals("rock"))
                || (p.equals("scissors") && o.equals("paper"));
    }

    public String toString() {
        if (didPlayerWin()) {
            return player.getName() + " won!\nCongratulations!";
        } else {
            return "Opponent won!\nBetter luck next time!";
        }
    }

    public String displayResults() {
        return "== GAME RESULTS ==\n" + player.toString() + "\n" + opponent.toString() + "\n"
                + this.toString();
    }

    // Static Methods

    public static boolean validateChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

    public static String generateRandomChoice() {
        int num = (int) (Math.random() * 3);
        if (num == 0) {
            return "rock";
        } else if (num == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }
}
