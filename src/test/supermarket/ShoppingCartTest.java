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


}
