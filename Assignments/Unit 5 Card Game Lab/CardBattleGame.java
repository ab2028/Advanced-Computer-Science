import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * CardBattleGame — the main game loop (students implement).
 *
 * USEFUL METHODS YOU'LL NEED:
 *
 * Card methods: card.applySelfOnPlay() -> applies shield/bonusDamage from the card's ability
 * card.getAbility().pingDamageOnPlay() -> how much ping damage this ability deals
 * card.getAbility().cyclesOnPlay() -> whether the card cycles to the bottom of the deck
 * card.computeDamageAgainst(defender) -> calculates damage with type multipliers
 * card.takeDamage(amount) -> reduces shield first, then health card.isDefeated() -> true if health
 * <= 0 card.getType() -> returns CardType (uses polymorphism!)
 *
 * PlayerState methods: state.getDeck() -> returns the player's ArrayList<Card> state.getActive() /
 * setActive(card) -> the currently active card (or null) state.hasAnythingLeft() -> true if active
 * card or cards remain in deck state.getPendingDamage() / setPendingDamage(int) -> stored Ripple
 * damage for next drawn card
 */
public class CardBattleGame {

    // To-do: Implement the full game.
    // Must print:
    // == CARD CLASH ==
    // Starting: Player/Bot
    // Winner: Player/Bot
    public static String playGame(ArrayList<Card> playerDeck, ArrayList<Card> botDeck, Random rng) {
        System.out.println("== CARD CLASH ==");
        PlayerState player = new PlayerState("Player", playerDeck);
        PlayerState bot = new PlayerState("Computer", botDeck);
        int randomInt = rng.nextInt();
        PlayerState attacker;
        PlayerState defender;

        if (randomInt % 2 == 0) {
            attacker = player;
            defender = bot;
        } else {
            attacker = bot;
            defender = player;
        }

        while (player.hasAnythingLeft() && bot.hasAnythingLeft()) {

            drawAndPlayIfNeeded(attacker, defender);
            drawAndPlayIfNeeded(defender, attacker);

            attackOnce(attacker, defender);

            PlayerState temp = attacker;
            attacker = defender;
            defender = temp;

        }

        if (player.hasAnythingLeft()) {
            System.out.println("Winner: Player");
            return "Player";
        } else {
            System.out.println("Winner: Bot");
            return "Bot";
        }

    }

    // ----- helpers you may implement or use -----

    // Draw top card if no active, apply on-play effects via card.applySelfOnPlay()
    public static void drawAndPlayIfNeeded(PlayerState self, PlayerState other) {
        if (self.getActive() == null && self.hasAnythingLeft()) {
            // draw top card
            Card card = self.getDeck().remove(0);
            self.setActive(card);

            card.applySelfOnPlay();

            int ping = card.getAbility().pingDamageOnPlay();

            if (ping > 0 && other.getActive() != null) {
                other.getActive().takeDamage(ping);
            }
        }
    }

    // One attack (self active attacks other active if both exist)
    public static void attackOnce(PlayerState attacker, PlayerState defender) {
        Card atkCard = attacker.getActive();
        Card defCard = defender.getActive();
        int damage = atkCard.computeDamageAgainst(defCard);

        defCard.takeDamage(damage);

        if (defCard.isDefeated()) {
            defender.setActive(null);
        }
    }

    // Optional local run (not graded)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Card> player = DeckValidator.buildDefaultDeck();
        ArrayList<Card> bot = DeckBuilderBot.buildBotDeck();

        if (!DeckValidator.isValidDeck(player)) {
            System.out.println("Player deck invalid!");
            return;
        }

        playGame(player, bot, new Random());
    }
}
