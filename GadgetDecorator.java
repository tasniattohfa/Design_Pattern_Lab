public abstract class GadgetDecorator implements Gadget {
    protected Gadget decoratedGadget;

    public GadgetDecorator(Gadget gadget) {
        this.decoratedGadget = gadget;
    }

    @Override
    public String getName() {
        return decoratedGadget.getName();
    }

    @Override
    public String getDescription() {
        return decoratedGadget.getDescription();
    }

    @Override
    public double getPrice() {
        return decoratedGadget.getPrice();
    }
}
