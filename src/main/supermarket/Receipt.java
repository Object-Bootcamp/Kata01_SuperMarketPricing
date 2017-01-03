package supermarket;

import supermarket.cart.CartItem;
import supermarket.cart.DiscountCart;
import supermarket.cart.ShoppingCart;
import supermarket.cart.ShoppingCartItem;
import supermarket.scheme.DiscountScheme;
import supermarket.scheme.QuantityScheme;
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
        registerScheme();
    }

    private void registerScheme() {
//        this.schemeStore.registerScheme(new DiscountScheme());
        this.schemeStore.registerScheme(new QuantityScheme());
    }

    public double total() {
        return shoppingCart.total();
    }

    public double discountedPrice() {
        applyScheme();
        return this.discountCart.total();
    }

    private void applyScheme() {
        for (CartItem shoppingCartItem : shoppingCart.cartItems())
            for (Scheme scheme : schemeStore.getSchemes())
                if (scheme.isApplicable((ShoppingCartItem) shoppingCartItem)) {
                    discountCart.add(scheme.apply((ShoppingCartItem) shoppingCartItem));
                }
    }

    public int discountCartQuantity() {
        return this.discountCart.getCartCount();
    }

    public int shoppingCartQuantity() {
        return this.shoppingCart.getCartCount();
    }
}
