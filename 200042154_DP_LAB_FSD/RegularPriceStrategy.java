public class RegularPriceStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double originalPrice) {
        return originalPrice;
    }
}
