package supermarket.cart;

import supermarket.product.DiscountProduct;

public class DiscountCartItem extends CartItem{

    public DiscountCartItem(DiscountProduct product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

}
