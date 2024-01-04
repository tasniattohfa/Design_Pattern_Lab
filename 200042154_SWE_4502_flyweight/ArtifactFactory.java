import java.util.HashMap;

public class ArtifactFactory {
    private HashMap<String, Artifact> artifactMap = new HashMap<>();

    public Artifact getArtifact(String name, String description) {
        if (!artifactMap.containsKey(name)) {
            Artifact artifact = new Artifact(name, description);
            artifactMap.put(name, artifact);
        }
        return artifactMap.get(name);
    }
}
// this flyweight factory for managing shared intrinsic states