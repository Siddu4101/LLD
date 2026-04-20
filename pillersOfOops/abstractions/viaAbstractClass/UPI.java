package pillersOfOops.abstractions.viaAbstractClass;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UPI extends APayment {
    @Override
    public void pay() {
        log.info("Paying through UPI via abstract class abstraction...");
    }
}
