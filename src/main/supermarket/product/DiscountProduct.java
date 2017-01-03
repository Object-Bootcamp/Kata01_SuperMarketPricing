package supermarket.product;

public class DiscountProduct extends Product{

    public DiscountProduct(String name, double price) {
        this.name = name;
        this.amount = price;
    }
}
