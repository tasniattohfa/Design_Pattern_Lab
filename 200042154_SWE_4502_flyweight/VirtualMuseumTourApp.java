public class VirtualMuseumTourApp {
    public static void main(String[] args) {
        ArtifactFactory artifactFactory = new ArtifactFactory();

        // creating shared intrinsic state (artifacts)
        Artifact monaLisa = artifactFactory.getArtifact("Mona Lisa", "A famous painting by Leonardo da Vinci.");
        Artifact venusDeMilo = artifactFactory.getArtifact("Venus de Milo", "An ancient Greek statue of Aphrodite.");

        // creating client objects (exhibits) with extrinsic states
        Exhibit exhibit1 = new Exhibit(10, 20, monaLisa);
        Exhibit exhibit2 = new Exhibit(30, 40, venusDeMilo);

        // displaying the exhibits
        exhibit1.display();
        exhibit2.display();
    }
}
