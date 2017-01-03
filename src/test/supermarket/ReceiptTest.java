package supermarket;

import org.junit.Before;
import org.junit.Test;
import supermarket.cart.ShoppingCart;
import supermarket.cart.ShoppingCartItem;
import supermarket.product.ShoppingProduct;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ReceiptTest {


    private ShoppingProduct banana;

    @Before
    public void setUp() throws Exception {
        banana = new ShoppingProduct("Banana", 10.00);
    }

    @Test
    public void totalPriceShouldConsiderScheme() {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.add(new ShoppingCartItem(banana, 4));

        Receipt receipt = new Receipt(shoppingCart);
        assertThat(receipt.total(), is(40.00));
        assertThat(receipt.discountedPrice(), is(40.00));
        assertThat(receipt.discountCartQuantity(), is(2));
        assertThat(receipt.shoppingCartQuantity(), is(1));
    }

}
