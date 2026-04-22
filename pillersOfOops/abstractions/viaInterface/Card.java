package pillersOfOops.abstractions.viaInterface;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Card implements IPayment {
    @Override
    public void pay() {
       log.info("Paying through credit card via interface abstraction...");
    }
}
