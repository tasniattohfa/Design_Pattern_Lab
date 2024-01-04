public class CircuitDeSpaFrancorchamps implements Track {
    @Override
    public void trackInfo() {
        System.out.println("Circuit de Spa-Francorchamps (Germany)");
    }

    @Override
    public void startLine() {
        System.out.println("Starting line at the beginning of the circular track.");
    }

    @Override
    public void finishLine() {
        System.out.println("Finishing line at the start of the circular track.");
    }
}
