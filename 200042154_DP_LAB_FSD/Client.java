public class Client {
    public static void main(String[] args) {
        // creating factories for gadgets
        SmartphoneFactory smartphoneFactory = new SmartphoneFactory();
        LaptopFactory laptopFactory = new LaptopFactory();
        TabletFactory tabletFactory = new TabletFactory();

        // making gadgets using factories
        Gadget smartphone = smartphoneFactory.createSmartphone("iPhone XV", "Latest iPhone model", $1499);
        Gadget laptop = laptopFactory.createLaptop("Dell XPS 15", "Powerful laptop with high-resolution display", $1999);
        Gadget tablet = tabletFactory.createTablet("iPad Air", "Thin and lightweight tablet", $499);

        // pricing strategies
        PricingStrategy regularPriceStrategy = new RegularPriceStrategy();
        PricingStrategy discountPriceStrategy = new DiscountedPriceStrategy(10); // 10% discount is given

        // applying the discount pricing strategy to the smartphone
        smartphone = applyPricingStrategy(smartphone, discountPriceStrategy);

        // decorated the gadgets with accessories and shipping options
        Gadget smartphoneWithAccessories = new GadgetWithAccessories(smartphone, "Wireless Earbuds");
        Gadget laptopWithExpressShipping = new GadgetWithExpressShipping(laptop, $29);

        // display gadget details and prices
        displayGadgetDetails(smartphoneWithAccessories);
        displayGadgetDetails(laptopWithExpressShipping);
        displayGadgetDetails(tablet);
    }

    public static Gadget applyPricingStrategy(Gadget gadget, PricingStrategy pricingStrategy) {
        double originalPrice = gadget.getPrice();
        double discountedPrice = pricingStrategy.calculatePrice(originalPrice);
        gadget = new GadgetWithDiscount(gadget, discountedPrice);
        return gadget;
    }

    public static void displayGadgetDetails(Gadget gadget) {
        System.out.println("Product: " + gadget.getName());
        System.out.println("Description: " + gadget.getDescription());
        System.out.println("Price: " + gadget.getPrice());
        System.out.println();
    }
}
