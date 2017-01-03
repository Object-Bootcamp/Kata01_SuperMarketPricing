package supermarket.scheme;


import supermarket.cart.DiscountCartItem;
import supermarket.cart.ShoppingCartItem;

import java.util.ArrayList;

public abstract class Scheme {
    public abstract boolean isApplicable(ShoppingCartItem shoppingCartItem);
    public abstract ArrayList<DiscountCartItem> apply(ShoppingCartItem shoppingCartItem);
}
