package supermarket.cart;


import java.util.ArrayList;

public class DiscountCart extends Cart {

    public DiscountCart() {
        super();
    }

    public void add(CartItem cartItem) {
        this.cartItems.add(cartItem);
    }

    public void add(ArrayList<DiscountCartItem> discountCartItems) {
        this.cartItems.addAll(discountCartItems);
    }

}
