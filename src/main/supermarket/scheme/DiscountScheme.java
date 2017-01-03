package supermarket.scheme;

import supermarket.cart.DiscountCartItem;
import supermarket.cart.ShoppingCartItem;
import supermarket.product.DiscountProduct;
import supermarket.product.ProductFactory;

import java.util.ArrayList;

public class DiscountScheme extends Scheme {
    @Override
    public boolean isApplicable(ShoppingCartItem shoppingCartItem) {
        return shoppingCartItem.getQuantity() >=3 && shoppingCartItem.isProduct("Soap");
    }

    @Override
    public ArrayList<DiscountCartItem> apply(ShoppingCartItem shoppingCartItem) {
        ArrayList<DiscountCartItem> discountCartItems = new ArrayList<>();

//        Discount is on 3 quantity.
//        DiscountProduct discountProduct = ProductFactory.createDiscountProductWithPrice(shoppingCartItem.getProduct(), );
        return discountCartItems;
    }
}