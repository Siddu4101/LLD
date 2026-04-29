package solidPrinciples.openClosePrinciple.withOpenClose;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InvoicePrinter {
    private final Cart cart;

    public InvoicePrinter(Cart cart) {
        this.cart = cart;
    }

    public void printInvoice(){
        cart.getProducts().forEach(p-> log.info("product name {} --> Price {}", p.getProductName(), p.getPrice()));
        log.info("Total price of the products is {}", cart.calTotalPrice());
    }

}
