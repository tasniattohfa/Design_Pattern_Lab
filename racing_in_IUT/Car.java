abstract class Car {
    EngineBehavior engineBehavior;
    TurbochargerBehavior turbochargerBehavior;

    abstract void carInfo();

    void start() {
        System.out.println("Car started");
    }

    void stop() {
        System.out.println("Car stopped");
    }

    void accelerate() {
        System.out.println("Car accelerating");
    }

    void setEngineBehavior(EngineBehavior engineBehavior) {
        this.engineBehavior = engineBehavior;
    }

    void setTurbochargerBehavior(TurbochargerBehavior turbochargerBehavior) {
        this.turbochargerBehavior = turbochargerBehavior;
    }
}
