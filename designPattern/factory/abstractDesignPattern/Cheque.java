package designPattern.factory.abstractDesignPattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cheque implements OfflinePaymentType {
    @Override
    public void pay() {
        log.info("Paying through Cheque");
    }
}
