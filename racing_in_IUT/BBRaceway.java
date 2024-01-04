public class BBRaceway implements Track {
    @Override
    public void trackInfo() {
        System.out.println("BB Raceway (Japan)");
    }

    @Override
    public void startLine() {
        System.out.println("Starting line at the beginning of the track.");
    }

    @Override
    public void finishLine() {
        System.out.println("Finishing line at the end of the track.");
    }
}
