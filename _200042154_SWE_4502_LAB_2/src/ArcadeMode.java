public class ArcadeMode extends FruitNinjaGame {
    private int bombsTouched = 1;

    @Override
    void displayWelcomeMessage() {
        System.out.println("Welcome to Arcade Mode of Fruit Ninja!");
    }

    @Override
    void initializeFruits() {
        System.out.println("Initializing fruits and bombs for Arcade Mode...");
    }

    @Override
    void playGame() {
        System.out.println("Playing Fruit Ninja in Arcade Mode...");
        // Game logic for Arcade Mode
    }

    @Override
    void displayScore() {
        System.out.println("Displaying Arcade Mode score...");
        System.out.println("Bombs touched: " + bombsTouched);
    }

    @Override
    void displayGameOverMessage() {
        if (bombsTouched > 0) {
            System.out.println("Game over! You touched a bomb.");
        } else {
            System.out.println("Congratulations! You've completed Arcade Mode.");
        }
    }

    @Override
    void playJungleEvent() {
        System.out.println("Playing Jungle Event in Arcade Mode...");

    }
}
