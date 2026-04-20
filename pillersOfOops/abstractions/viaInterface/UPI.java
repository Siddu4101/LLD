package pillersOfOops.abstractions.viaInterface;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UPI implements IPayment{
    @Override
    public void pay() {
        log.info("Paying through UPI via interface abstraction...");
    }
}
