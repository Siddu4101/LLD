package designPattern.strategy.withStrategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DebitCard implements PaymentType {
    @Override
    public void pay() {
        log.info("Paying through DebitCard");
    }
}
