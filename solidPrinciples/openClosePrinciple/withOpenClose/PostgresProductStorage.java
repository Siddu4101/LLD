package solidPrinciples.openClosePrinciple.withOpenClose;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PostgresProductStorage implements ProductStorage {
    @Override
    public void saveProducts(Cart cart) {
        log.info("Saving products to database count {}", cart.getProducts().size());
    }
}
