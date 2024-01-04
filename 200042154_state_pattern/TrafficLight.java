class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        this.state = new RedState();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void display() {
        state.display();
    }

    public void switchState() {
        state.switchState(this);
    }
}