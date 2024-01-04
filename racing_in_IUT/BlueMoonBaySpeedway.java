public class BlueMoonBaySpeedway implements Track {
    @Override
    public void trackInfo() {
        System.out.println("Blue Moon Bay Speedway (USA)");
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
