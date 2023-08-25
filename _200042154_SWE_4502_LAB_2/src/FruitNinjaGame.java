import java.time.DayOfWeek;
import java.time.LocalDate;
public abstract class FruitNinjaGame {
    abstract void displayWelcomeMessage();
    abstract void initializeFruits();
    abstract void playGame();
    abstract void displayScore();
    abstract void displayGameOverMessage();
    abstract void playJungleEvent();

    boolean jungleEventAvailable() {
        return isThursday(); // available on thursday..so checking
    }

    private boolean isThursday() {
        LocalDate currentDate = LocalDate.now();
        if (currentDate.getDayOfWeek() == DayOfWeek.THURSDAY) {
            playJungleEvent();
            return true; // Jungle Event is available only on Thursday
        } else {
            System.out.println("Jungle Event is not available today.");
            return false; // Jungle Event not available on other days
        }
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
