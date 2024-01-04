public class CoupeCarFactory extends CarFactory {
    @Override
    Car createCar(String carType) {
        switch (carType) {
            case "ToyotaGR86":
                return new ToyotaGR86();
            case "SubaruBRZ":
                return new SubaruBRZ();
            default:
                return null;
        }
    }
}
