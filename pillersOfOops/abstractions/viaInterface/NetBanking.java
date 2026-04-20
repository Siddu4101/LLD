package pillersOfOops.abstractions.viaInterface;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NetBanking implements IPayment{
    @Override
    public void pay() {
        log.info("Paying through net banking via interface abstraction...");
    }
}
