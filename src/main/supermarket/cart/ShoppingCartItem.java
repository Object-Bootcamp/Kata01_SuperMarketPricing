package supermarket.cart;

import supermarket.product.ShoppingProduct;

public class ShoppingCartItem extends CartItem{

    public ShoppingCartItem(ShoppingProduct product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double total() {
        return product.price() * quantity;
    }
}
