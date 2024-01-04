public class TabletFactory extends GadgetFactory {
    public Gadget createTablet(String name, String description, double price) {
        return new Tablet(name, description, price);
    }
}
