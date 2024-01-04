public class VillageBuilder {
    private Village village;

    public VillageBuilder() {
        village = new Village();
    }

    public VillageBuilder addHouse(House house) {
        village.addHouse(house);
        return this;
    }

    public VillageBuilder addTree(Tree tree) {
        village.addTree(tree);
        return this;
    }

    public VillageBuilder addWaterSource(WaterSource waterSource) {
        village.addWaterSource(waterSource);
        return this;
    }

    public Village build() {
        return village;
    }
}
