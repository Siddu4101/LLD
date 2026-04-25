package solidPrinciples.openClosePrinciple.withoutOpenClose;

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

    /*As a new Requirement i need to add 2 more storage mango db store and the file storage */
    public void saveProductsToMangoDatabase(){
        log.info("Saving products to mango database count {}", cart.getProducts().size());
    }

    public void saveProductsToFile(){
        log.info("Saving products to file, count {}", cart.getProducts().size());
    }
}
