public class Exhibit {
    private int locationX;
    private int locationY;
    private Artifact artifact;

    public Exhibit(int locationX, int locationY, Artifact artifact) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.artifact = artifact;
    }

    public void display() {
        artifact.display(locationX, locationY);
    }
}
//client object with extrinsic states