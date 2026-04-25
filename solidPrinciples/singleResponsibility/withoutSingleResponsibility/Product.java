package solidPrinciples.singleResponsibility.withoutSingleResponsibility;

import java.math.BigDecimal;

public class Product {
    private final BigDecimal price;
    private final String productName;

    public Product(BigDecimal price, String productName) {
        this.price = price;
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
