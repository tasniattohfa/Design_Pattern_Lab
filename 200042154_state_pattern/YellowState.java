class YellowState implements TrafficLightState {
    @Override
    public void display() {
        System.out.println("Traffic Light: Yellow");
    }

    @Override
    public void switchState(TrafficLight trafficLight) {
        trafficLight.setState(new RedState());
    }
}