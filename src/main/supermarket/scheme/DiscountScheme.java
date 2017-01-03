package supermarket.scheme;

import supermarket.cart.DiscountCartItem;
import supermarket.cart.ShoppingCartItem;
import supermarket.product.DiscountProduct;
import supermarket.product.ProductFactory;

import java.util.ArrayList;

public class DiscountScheme extends Scheme {
    @Override
    public boolean isApplicable(ShoppingCartItem shoppingCartItem) {
        return shoppingCartItem.getQuantity() >=2 && shoppingCartItem.isProduct("Banana");
    }

    @Override
    public ArrayList<DiscountCartItem> apply(ShoppingCartItem shoppingCartItem) {
        return null;
    }
}