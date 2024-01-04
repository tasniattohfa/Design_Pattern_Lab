public class Main {
    public static void main(String[] args) {
        BrickVillageBuilder brickVillageBuilder = new BrickVillageBuilder();
        Village brickVillage = brickVillageBuilder.buildBrickVillage();
        brickVillage.display();

        MudVillageBuilder mudVillageBuilder = new MudVillageBuilder();
        Village mudVillage = mudVillageBuilder.buildMudVillage();
        mudVillage.display();
    }
}
