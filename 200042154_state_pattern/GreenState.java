class GreenState implements TrafficLightState {
    @Override
    public void display() {
        System.out.println("Traffic Light: Green");
    }

    @Override
    public void switchState(TrafficLight trafficLight) {
        trafficLight.setState(new YellowState());
    }
}