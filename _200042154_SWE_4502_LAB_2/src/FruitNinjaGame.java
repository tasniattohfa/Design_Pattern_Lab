public abstract class FruitNinjaGame {
    abstract void displayWelcomeMessage();
    abstract void initializeFruits();
    abstract void playGame();
    abstract void displayScore();
    abstract void displayGameOverMessage();
    abstract void playJungleEvent();

    boolean jungleEventAvailable() {
        return true; // Default assuming available
    }

    public void play() {
        displayWelcomeMessage();
        initializeFruits();
        if (jungleEventAvailable()) {
            playJungleEvent();
        }
        playGame();
        displayScore();
        displayGameOverMessage();
    }
}
