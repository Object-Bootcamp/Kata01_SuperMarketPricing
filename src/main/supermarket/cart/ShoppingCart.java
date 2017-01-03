package supermarket.cart;


public class ShoppingCart extends Cart {

    public ShoppingCart() {
        super();
    }

    public void add(CartItem cartItem) {
        this.cartItems.add(cartItem);
    }

}
