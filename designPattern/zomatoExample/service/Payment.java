package designPattern.zomatoExample.service;

import designPattern.zomatoExample.client.User;

import java.math.BigDecimal;

public interface Payment {
    void pay(User user, BigDecimal amount);
}
