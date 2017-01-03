package supermarket.product;

public abstract class Product {
    double amount;
    String name;

    public Product() {
    }

    public double price() {
        return this.amount;
    }

    public boolean isProduct(String productName) {
        return this.name == productName;
    }
}
