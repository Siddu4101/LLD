package solidPrinciples.openClosePrinciple.withOpenClose;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MongoProductStorage implements ProductStorage{

    @Override
    public void saveProducts(Cart cart) {
        log.info("Saving products to mango database count {}", cart.getProducts().size());
    }
}
