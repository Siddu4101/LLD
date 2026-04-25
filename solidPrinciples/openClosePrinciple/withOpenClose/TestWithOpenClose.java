package solidPrinciples.openClosePrinciple.withOpenClose;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
public class TestWithOpenClose {

    public static void main(String[] args) {
        Product hpVictus = new Product(BigDecimal.valueOf(80000), "Hp Victus");
        Product vivoY50 = new Product(BigDecimal.valueOf(17500), "Vivo Y50");
        Cart cart = new Cart(List.of(hpVictus, vivoY50));
        log.info("total products price {}", cart.calTotalPrice());
        InvoicePrinter invoicePrinter = new InvoicePrinter(cart);
        invoicePrinter.printInvoice();
        /*Now we can extend the storage as many we want as we have created the contract via interface whenever a new stage
        * comes we can extend by adding a new class and no class modification for existing once (open-close principle)*/
        /*based on ur requirement call the correct storage*/
        ProductStorage postgresProductStorage = new PostgresProductStorage();
        postgresProductStorage.saveProducts(cart);
        ProductStorage mangoProductStorage = new MongoProductStorage();
        mangoProductStorage.saveProducts(cart);
        ProductStorage fileProductStorage = new FileProductStorage();
        fileProductStorage.saveProducts(cart);
    }

}
