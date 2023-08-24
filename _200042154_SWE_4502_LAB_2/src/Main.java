public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager(new ClassicMode());
        gameManager.startGame();

        System.out.println();

        gameManager.setGameMode(new ZenMode());
        gameManager.startGame();

        System.out.println();

        gameManager.setGameMode(new ArcadeMode());
        gameManager.startGame();
    }
}
