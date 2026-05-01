package designPattern.factory.abstractDesignPattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Card implements OnlinePaymentType {
    @Override
    public void pay() {
        log.info("Paying through Card");
    }
}
