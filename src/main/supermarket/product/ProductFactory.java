package supermarket.product;

public class ProductFactory {
    public static DiscountProduct createFreeProduct(Product product) {
        return new DiscountProduct(product.getName(), 0.0);
    }

    public static DiscountProduct createDiscountProductFromShoppingProduct(Product product) {
        return new DiscountProduct(product);
    }
}
