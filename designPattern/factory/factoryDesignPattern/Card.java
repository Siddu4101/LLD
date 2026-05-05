package designPattern.factory.factoryDesignPattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Card implements PaymentType {
    @Override
    public void pay() {
        log.info("Paying through Card");
    }
}
