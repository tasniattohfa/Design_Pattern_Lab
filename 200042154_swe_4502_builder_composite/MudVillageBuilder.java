public class MudVillageBuilder {
    public Village buildMudVillage() {
        return new VillageBuilder()
            .addHouse(new MudHouse())
            .addTree(new BananaTree())
            .addWaterSource(new Pond())
            .build();
    }
}