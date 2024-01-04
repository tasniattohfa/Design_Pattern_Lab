public class GadgetWithAccessories extends GadgetDecorator {
    private String accessory;

    public GadgetWithAccessories(Gadget gadget, String accessory) {
        super(gadget);
        this.accessory = accessory;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with " + accessory;
    }
}
