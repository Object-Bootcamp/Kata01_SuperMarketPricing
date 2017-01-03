package supermarket.cart;

import supermarket.product.Product;

public abstract class CartItem {
    protected Product product;
    protected int quantity;

    public abstract double total();

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isProduct(String productName){
        return product.isProduct(productName);
    }

}
