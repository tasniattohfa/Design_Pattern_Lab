public class DiscountedPriceStrategy implements PricingStrategy {
    private double discountPercentage;

    public DiscountedPriceStrategy(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculatePrice(double originalPrice) {
        return originalPrice * (1 - discountPercentage / 100);
    }
}
