package supermarket.cart;

import supermarket.product.ShoppingProduct;

public class DiscountCartItem extends CartItem{

    public DiscountCartItem(ShoppingProduct product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public double total() {
        return 0;
    }
}
