package supermarket.product;

public class ProductFactory {
    public static DiscountProduct getFreeProduct(Product product) {
        return new DiscountProduct(product.getName(), 0.0);
    }

    public static DiscountProduct getDiscountProductFromShoppingProduct(Product product) {
        return new DiscountProduct(product);
    }
}
