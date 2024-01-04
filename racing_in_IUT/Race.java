import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;

public class Race {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    private static final Random random = new Random();

    void race() {
        Scanner scanner = new Scanner(System.in);

        // Abstract Factory for Cars
        CarFactory carFactory;

        System.out.println("Choose car category (1. Coupe, 2. Roadster): ");
        int carCategory = scanner.nextInt();

        if (carCategory == 1) {
            carFactory = new CoupeCarFactory();
            System.out.println("Choose car (1. ToyotaGR86, 2. SubaruBRZ): ");
        } else {
            carFactory = new RoadsterCarFactory();
            System.out.println("Choose car (1. PorscheBoxster, 2. Ferrari812): ");
        }

        int carChoice = scanner.nextInt();
        Car chosenCar = carFactory.createCar(getCarType(carChoice));

        // Choose track
        System.out
                .println("Choose track (1. Blue Moon Bay Speedway, 2. BB Raceway, 3. Circuit de Spa-Francorchamps): ");
        int trackChoice = scanner.nextInt();
        Track chosenTrack = getTrack(trackChoice);

        // Choose racing type
        System.out.println("Choose racing type (1. Sprint, 2. Circuit): ");
        int racingType = scanner.nextInt();

        // Ask if NOS should be added
        System.out.println("Do you want to add NOS? (yes/no): ");
        String addNosChoice = scanner.next();

        TurbochargerBehavior nosTurbocharger = null; // Initialize to null

        if ("yes".equalsIgnoreCase(addNosChoice)) {
            // Choose NOS
            System.out.println("Choose NOS (1. Resonac, 2. Sema): ");
            int nosChoice = scanner.nextInt();

            if (nosChoice == 1) {
                nosTurbocharger = new ResonacNOS();
                System.out.println("Selected NOS: Resonac");
            } else {
                nosTurbocharger = new SemaNOS();
                System.out.println("Selected NOS: Sema");
            }
        } else {
            // No NOS selected
            System.out.println("No NOS added.");
        }

        raceSteps(chosenCar, chosenTrack, racingType, nosTurbocharger);
    }

    private void raceSteps(Car car, Track track, int racingType, TurbochargerBehavior nosTurbocharger) {
        car.carInfo();
        track.trackInfo();

        car.start();
        track.startLine();

        car.accelerate();

        if (racingType == 1) {
            // Sprint racing
            car.stop();
            track.finishLine();
        } else {
            // Circuit racing
            if (nosTurbocharger != null) {
                NOS nosCar = pitStop(car, nosTurbocharger);
                nosCar.applyNos();
                System.out.println("NOS type during the race: " + nosTurbocharger.getClass().getSimpleName());

                track.startLine(); // Since the track is circular, finishing line means the start of the track
                car.accelerate();
                car.stop();
                System.out.println("Stopped for NOS: " + nosTurbocharger.getClass().getSimpleName());
                track.finishLine();

                nosCar.stop();
            } else {
                // No NOS selected
                System.out.println("No NOS added for circuit racing.");
            }
        }

        lapTime();
    }

    private NOS pitStop(Car car, TurbochargerBehavior nosTurbocharger) {
        System.out.println("Pit stop for NOS: " + nosTurbocharger.getClass().getSimpleName());
        return new NOS(car, nosTurbocharger);
    }

    private void lapTime() {
        int hours = random.nextInt(24);
        int minutes = random.nextInt(60);
        int seconds = random.nextInt(60);

        System.out.println("Lap time: " + sdf.format(hours * 3600000 + minutes * 60000 + seconds * 1000));
    }

    private String getCarType(int choice) {
        switch (choice) {
            case 1:
                return "ToyotaGR86";
            case 2:
                return "SubaruBRZ";
            case 3:
                return "PorscheBoxster";
            case 4:
                return "Ferrari812";
            default:
                return null;
        }
    }

    private Track getTrack(int choice) {
        switch (choice) {
            case 1:
                return new BlueMoonBaySpeedway();
            case 2:
                return new BBRaceway();
            case 3:
                return new CircuitDeSpaFrancorchamps();
            default:
                return null;
        }
    }
}
