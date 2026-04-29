package solidPrinciples.openClosePrinciple.withoutOpenClose;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
public class TestWithoutOpenClonse {
    public static void main(String[] args) {
        Product hpVictus = new Product(BigDecimal.valueOf(80000), "Hp Victus");
        Product vivoY50 = new Product(BigDecimal.valueOf(17500), "Vivo Y50");
        Cart cart = new Cart(List.of(hpVictus, vivoY50));
        log.info("total products price {}", cart.calTotalPrice());
        InvoicePrinter invoicePrinter = new InvoicePrinter(cart);
        invoicePrinter.printInvoice();
        ProductStorage productStorage = new ProductStorage(cart);
        productStorage.saveProductsToDatabase();
        /*these 2 new storage making us to modify existing Storage class which is violating the open-close*/
        productStorage.saveProductsToMangoDatabase();
        productStorage.saveProductsToFile();
    }
}
