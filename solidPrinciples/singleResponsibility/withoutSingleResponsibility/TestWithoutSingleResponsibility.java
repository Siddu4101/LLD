package solidPrinciples.singleResponsibility.withoutSingleResponsibility;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
public class TestWithoutSingleResponsibility {
    public static void main(String[] args) {
        Product hpVictus = new Product(BigDecimal.valueOf(80000), "Hp Victus");
        Product vivoY50 = new Product(BigDecimal.valueOf(17500), "Vivo Y50");
        Cart cart = new Cart(List.of(hpVictus, vivoY50));
        /*all responsibility is on cart class and update can become reason for cart class*/
        log.info("total products price :{}", cart.calTotalPrice());
        cart.printInvoice();
        cart.saveProductsToDatabase();
    }
}
