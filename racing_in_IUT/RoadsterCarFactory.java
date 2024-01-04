public class RoadsterCarFactory extends CarFactory {
    @Override
    Car createCar(String carType) {
        switch (carType) {
            case "PorscheBoxster":
                return new PorscheBoxster();
            case "Ferrari812":
                return new Ferrari812();
            default:
                return null;
        }
    }
}
