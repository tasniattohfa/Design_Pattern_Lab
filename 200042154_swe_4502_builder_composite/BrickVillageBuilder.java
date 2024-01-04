public class BrickVillageBuilder {
    public Village buildBrickVillage() {
        return new VillageBuilder()
            .addHouse(new BrickHouse())
            .addTree(new MangoTree())
            .addWaterSource(new SwimmingPool())
            .build();
    }
}
