class RedState implements TrafficLightState {
    @Override
    public void display() {
        System.out.println("Traffic Light: Red");
    }

    @Override
    public void switchState(TrafficLight trafficLight) {
        trafficLight.setState(new GreenState());
    }
}