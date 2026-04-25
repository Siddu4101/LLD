package solidPrinciples.singleResponsibility.withSingleResponsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductStorage {
    private final Cart cart;

    public ProductStorage(Cart cart) {
        this.cart = cart;
    }

    public void saveProductsToDatabase(){
        log.info("Saving products to database count {}", cart.getProducts().size());
    }
}
