package supermarket.cart;


public class ShoppingCart extends Cart {

    public ShoppingCart() {
        super();
    }

    @Override
    public double total() {
        double total = 0;
        for (CartItem cartItem : this.cartItems)
            total += cartItem.total();
        return total;
    }

    public void add(CartItem cartItem) {
        this.cartItems.add(cartItem);
    }

}
