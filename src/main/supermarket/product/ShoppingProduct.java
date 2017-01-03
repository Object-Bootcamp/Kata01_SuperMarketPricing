package supermarket.product;

import supermarketException.SuperMarketException;

public class ShoppingProduct extends Product{


    public ShoppingProduct(String name, double amount) {
        super();
        if(amount <=0) {
            try {
                throw SuperMarketException.priceNotValidException();
            } catch (SuperMarketException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
        this.amount = amount;
    }

}
