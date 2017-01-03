package supermarket.scheme;

import supermarket.cart.DiscountCart;
import supermarket.cart.DiscountCartItem;
import supermarket.cart.ShoppingCartItem;
import supermarket.product.DiscountProduct;

public class DiscountScheme extends Scheme {
    @Override
    public boolean isApplicable(ShoppingCartItem shoppingCartItem) {
        return shoppingCartItem.getQuantity() ==2 && shoppingCartItem.isProduct("Banana");
    }

    @Override
    public DiscountCartItem apply(ShoppingCartItem shoppingCartItem) {
        DiscountCart discountCart = new DiscountCart();
//        discountCart.add(new DiscountProduct(), );
        return null;

    }
}