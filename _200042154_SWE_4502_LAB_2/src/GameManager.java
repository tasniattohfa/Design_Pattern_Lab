public class GameManager {
    private FruitNinjaGame gameMode;

    public GameManager(FruitNinjaGame gameMode) {
        this.gameMode = gameMode;
    }

    public void startGame() {
        gameMode.play();
    }

    public void setGameMode(FruitNinjaGame gameMode) {
        this.gameMode = gameMode;
    }
}
