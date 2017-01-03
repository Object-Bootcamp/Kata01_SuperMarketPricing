package supermarket.scheme;

import supermarket.cart.DiscountCartItem;
import supermarket.cart.ShoppingCartItem;
import supermarket.product.DiscountProduct;

public class QuantityScheme extends Scheme {

    @Override
    public boolean isApplicable(ShoppingCartItem shoppingCartItem) {
        return shoppingCartItem.getQuantity() == 3;
    }

    @Override
    public DiscountCartItem apply(ShoppingCartItem shoppingCartItem) {

        return null;
    }
}
