import java.util.ArrayList;
import java.util.List;

public class Village {
    private List<House> houses;
    private List<Tree> trees;
    private List<WaterSource> waterSources;

    public Village() {
        houses = new ArrayList<>();
        trees = new ArrayList<>();
        waterSources = new ArrayList<>();
    }

    public void addHouse(House house) {
        houses.add(house);
    }

    public void addTree(Tree tree) {
        trees.add(tree);
    }

    public void addWaterSource(WaterSource waterSource) {
        waterSources.add(waterSource);
    }

    public void display() {
        System.out.println("This village contains:");
        for (House house : houses) {
            System.out.println(" - " + house.getDescription());
        }
        for (Tree tree : trees) {
            System.out.println(" - " + tree.getDescription());
        }
        for (WaterSource waterSource : waterSources) {
            System.out.println(" - " + waterSource.getDescription());
        }
    }
}
