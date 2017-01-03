package supermarketException;

public class SuperMarketException extends Exception {
    private static final String PRICE_NOT_VALID = "Price is not valid!";

    public SuperMarketException(String message) {
        super(message);
    }

    public static SuperMarketException priceNotValidException() {
        return new SuperMarketException(PRICE_NOT_VALID);
    }
}
