package pillersOfOops.abstractions.viaAbstractClass;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NetBanking extends APayment {
    @Override
    public void pay() {
        log.info("Paying through net banking via abstract class abstraction..");
    }
}
