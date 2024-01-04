public class SmartphoneFactory extends GadgetFactory {
    public Gadget createSmartphone(String name, String description, double price) {
        return new Smartphone(name, description, price);
    }
}
