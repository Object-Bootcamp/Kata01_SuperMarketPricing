package supermarket;

import supermarket.cart.CartItem;
import supermarket.cart.DiscountCart;
import supermarket.cart.ShoppingCart;
import supermarket.cart.ShoppingCartItem;
import supermarket.scheme.Scheme;
import supermarket.scheme.SchemeStore;

public class Receipt {
    private final ShoppingCart shoppingCart;
    private final SchemeStore schemeStore;
    private final DiscountCart discountCart;

    public Receipt(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
        this.discountCart = new DiscountCart();
        this.schemeStore = new SchemeStore();
    }

    public double total() {
        return shoppingCart.total();
    }

    public double discountedPrice() {
        double total = 0;
        for (CartItem shoppingCartItem : shoppingCart.cartItems())
            for (Scheme scheme : schemeStore.getSchemes())
                if (scheme.isApplicable((ShoppingCartItem) shoppingCartItem)) {
                    discountCart.add(scheme.apply((ShoppingCartItem) shoppingCartItem));
                }
        return total;
    }
}
