package solidPrinciples.singleResponsibility.withSingleResponsibility;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
public class TestWithSingleResponsibility {
    public static void main(String[] args) {
        Product hpVictus = new Product(BigDecimal.valueOf(80000), "Hp Victus");
        Product vivoY50 = new Product(BigDecimal.valueOf(17500), "Vivo Y50");
        Cart cart = new Cart(List.of(hpVictus, vivoY50));
        /*each class has it's won responsibility there is a single reason to update each class*/
        log.info("total products price {}", cart.calTotalPrice());
        InvoicePrinter invoicePrinter = new InvoicePrinter(cart);
        invoicePrinter.printInvoice();
        ProductStorage productStorage = new ProductStorage(cart);
        productStorage.saveProductsToDatabase();
    }
}
