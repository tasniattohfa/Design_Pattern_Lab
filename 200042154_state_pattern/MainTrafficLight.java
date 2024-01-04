public class MainTrafficLight {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.display();
        trafficLight.switchState();
        trafficLight.display();
        trafficLight.switchState();
        trafficLight.display();
        trafficLight.switchState();
        trafficLight.display();
    }
}
