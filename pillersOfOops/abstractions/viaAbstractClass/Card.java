package pillersOfOops.abstractions.viaAbstractClass;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Card extends APayment {
    @Override
    public void pay() {
       log.info("Paying through credit card via abstract class abstraction...");
    }
}
