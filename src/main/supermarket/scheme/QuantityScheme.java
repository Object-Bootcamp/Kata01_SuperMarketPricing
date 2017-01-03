package supermarket.scheme;

import supermarket.cart.DiscountCartItem;
import supermarket.cart.ShoppingCartItem;
import supermarket.product.DiscountProduct;
import supermarket.product.ProductFactory;

import java.util.ArrayList;

public class QuantityScheme extends Scheme {

    @Override
    public boolean isApplicable(ShoppingCartItem shoppingCartItem) {
        return shoppingCartItem.getQuantity() >= 2 && shoppingCartItem.isProduct("Banana");
    }

    @Override
    public ArrayList<DiscountCartItem> apply(ShoppingCartItem shoppingCartItem) {
        ArrayList<DiscountCartItem> discountCartItems = new ArrayList<>();
        DiscountProduct discountProduct = ProductFactory.getDiscountProductFromShoppingProduct(shoppingCartItem.getProduct());
        DiscountProduct freeProduct = ProductFactory.getFreeProduct(shoppingCartItem.getProduct());

        discountCartItems.add(new DiscountCartItem(discountProduct, shoppingCartItem.getQuantity()));
        discountCartItems.add(new DiscountCartItem(freeProduct, shoppingCartItem.getQuantity() / 2));


        return discountCartItems;

    }
}
