package supermarket.product;

public class DiscountProduct extends Product{

    public DiscountProduct(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public DiscountProduct(Product product) {
        this.name = product.name;
        this.amount = product.amount;
    }
}
