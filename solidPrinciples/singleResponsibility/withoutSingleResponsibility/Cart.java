package solidPrinciples.singleResponsibility.withoutSingleResponsibility;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
public class Cart {
    private final List<Product> products;

    public Cart(List<Product> products) {
        this.products = products;
    }

    public BigDecimal calTotalPrice(){
        return products.stream().map(Product::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void printInvoice(){
        products.forEach(p->{
            log.info("product name {} --> Price {}", p.getProductName(), p.getPrice());
        });
        log.info("Total price of the products is {}", calTotalPrice());
    }

    public void saveProductsToDatabase(){
        log.info("Saving products to database count: {}", products.size());
    }
}
