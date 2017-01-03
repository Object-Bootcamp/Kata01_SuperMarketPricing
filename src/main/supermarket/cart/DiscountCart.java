package supermarket.cart;


public class DiscountCart extends Cart {

    public DiscountCart() {
        super();
    }

    @Override
    public double total() {
        return 0;
    }

    public void add(CartItem cartItem) {
        this.cartItems.add(cartItem);
    }

}
