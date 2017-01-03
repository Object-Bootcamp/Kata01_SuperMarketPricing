package supermarket.scheme;


import supermarket.cart.DiscountCartItem;
import supermarket.cart.ShoppingCartItem;

public abstract class Scheme {
    public abstract boolean isApplicable(ShoppingCartItem shoppingCartItem);
    public abstract DiscountCartItem apply(ShoppingCartItem shoppingCartItem);
}
