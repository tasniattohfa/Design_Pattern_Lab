public class NOS extends Car {
    private Car car;
    private TurbochargerBehavior nosTurbocharger;

    public NOS(Car car, TurbochargerBehavior nosTurbocharger) {
        this.car = car;
        this.nosTurbocharger = nosTurbocharger;
    }

    @Override
    void carInfo() {
        car.carInfo();
        System.out.println("With NOS: " + nosTurbocharger.getClass().getSimpleName());
    }

    @Override
    void start() {
        car.start();
    }

    @Override
    void stop() {
        car.stop();
    }

    void applyNos() {
        System.out.println("Applying NOS to boost performance: " + nosTurbocharger.getClass().getSimpleName());
    }
}
