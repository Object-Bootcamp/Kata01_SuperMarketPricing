package supermarket;

import org.junit.Before;
import org.junit.Test;
import supermarket.cart.ShoppingCart;
import supermarket.cart.ShoppingCartItem;
import supermarket.product.ShoppingProduct;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShoppingCartTest {
    private ShoppingProduct banana, soap;

    @Before
    public void setUp() throws Exception {
         banana = new ShoppingProduct("Banana", 10.00);
         soap = new ShoppingProduct("Soap", 20.00);
    }

    @Test
    public void totalPriceShouldConsiderScheme() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(new ShoppingCartItem(banana, 2));
        shoppingCart.add(new ShoppingCartItem(soap, 3));

        Receipt receipt = new Receipt(shoppingCart);
        assertThat(receipt.total(), is(80.00));
//        assertThat(receipt.discountedPrice(), is(80.00));
    }
}
