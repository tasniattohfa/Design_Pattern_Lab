public class LaptopFactory extends GadgetFactory{
    public Gadget createLaptop(String name, String description, double price) {
        return new Laptop(name, description, price);
    }
}
