public class GadgetWithExpressShipping extends GadgetDecorator {
    private double shippingCost;

    public GadgetWithExpressShipping(Gadget gadget, double shippingCost) {
        super(gadget);
        this.shippingCost = shippingCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + shippingCost;
    }
}
