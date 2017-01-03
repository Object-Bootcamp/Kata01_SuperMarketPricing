package supermarket.cart;

import java.util.ArrayList;

public abstract class Cart {
    ArrayList<CartItem> cartItems;

    public Cart() {
        this.cartItems =  new ArrayList<>();
    }

    public double total(){
        double total = 0;
        for (CartItem cartItem : this.cartItems)
            total += cartItem.total();
        return total;
    }

    public ArrayList<CartItem> cartItems() {
        return cartItems;
    }

    public abstract void add(CartItem cartItem);

    public int getCartCount() {
        return this.cartItems.size();
    }
}
