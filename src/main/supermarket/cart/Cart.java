package supermarket.cart;

import java.util.ArrayList;

public abstract class Cart {
    ArrayList<CartItem> cartItems;

    public Cart() {
        this.cartItems =  new ArrayList<>();
    }

    public abstract double total();

    public ArrayList<CartItem> cartItems() {
        return cartItems;
    }

    public abstract void add(CartItem cartItem);
}
