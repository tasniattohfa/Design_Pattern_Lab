public class ZenMode extends FruitNinjaGame {

    private final int timeLimitInSeconds = 90;
    private int currentTimeInSeconds = 90;
    @Override
    void displayWelcomeMessage() {
        System.out.println("Welcome to Zen Mode of Fruit Ninja!");
    }

    @Override
    void initializeFruits() {
        System.out.println("Initializing fruits for Zen Mode...");
    }

    @Override
    void playGame() {
        System.out.println("Playing Fruit Ninja in Zen Mode...");
        // Game logic for Zen Mode
        while (currentTimeInSeconds < timeLimitInSeconds) {
            // Simulate the passage of time and gameplay logic
            // ...
            currentTimeInSeconds++; // Increment the time
        }
    }

    @Override
    void displayScore() {
        System.out.println("Displaying Zen Mode score...");
    }

    @Override
    void displayGameOverMessage() {
        if (currentTimeInSeconds > timeLimitInSeconds) {
            System.out.println("Game over! Time limit exceeded. Zen Mode is over.");
        } else {
            System.out.println("Time's up! Zen Mode is over.");
        }
    }

    @Override
    void playJungleEvent() {
        System.out.println("Playing Jungle Event in Zen Mode.");
    }
}
