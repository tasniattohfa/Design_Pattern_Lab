public class ClassicMode extends FruitNinjaGame {

    private int missedFruits = 0;
    private final int maxMissedFruits = 3;

    @Override
    void displayWelcomeMessage() {
        System.out.println("Welcome to Classic Mode of Fruit Ninja!");
    }

    @Override
    void initializeFruits() {
        System.out.println("Initializing fruits for Classic Mode...");
    }

    @Override
    void playGame() {
        System.out.println("Playing Fruit Ninja in Classic Mode...");

    }

    @Override
    void displayScore() {
        System.out.println("Displaying Classic Mode score...");
    }


    @Override
    void displayGameOverMessage() {
        if (missedFruits >= maxMissedFruits) {
            System.out.println("Game over! You missed too many fruits.");
        } else {
            System.out.println("Congratulations! You've completed Classic Mode.");
        }
    }


    @Override
    void playJungleEvent() {
        System.out.println("No Jungle Event in Classic Mode.");
    }
}
