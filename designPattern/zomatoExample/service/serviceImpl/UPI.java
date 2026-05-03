package designPattern.zomatoExample.service.serviceImpl;

import designPattern.zomatoExample.client.User;
import designPattern.zomatoExample.service.Payment;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class UPI implements Payment {
    @Override
    public void pay(User user, BigDecimal amount) {
        log.info("Paying through UPI with details ph.no:{} for amount:{}", user.getUserInfo().getPhNo(), amount);
        user.getNotification().sendNotification(user, "Order placed successfully, via UPI");
    }
}
