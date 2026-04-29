package solidPrinciples.openClosePrinciple.withoutOpenClose;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
public class Cart {
    private final List<Product> products;

    public Cart(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public BigDecimal calTotalPrice(){
        return products.stream().map(Product::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
