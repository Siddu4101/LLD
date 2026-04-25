package solidPrinciples.openClosePrinciple.withOpenClose;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileProductStorage implements ProductStorage{

    @Override
    public void saveProducts(Cart cart) {
        log.info("Saving products to file, count {}", cart.getProducts().size());
    }
}
