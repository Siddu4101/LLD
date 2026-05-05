package designPattern.strategy.withoutStrategy;

import lombok.extern.slf4j.Slf4j;

import java.security.InvalidAlgorithmParameterException;

@Slf4j
public class TestWithoutStrategy {

    public static void main(String[] args) throws InvalidAlgorithmParameterException {
        makePayment("UPI");
        makePayment("CARD");
        makePayment("NETBANKING");
        /*When u want to add the new method of payment u need to modify same class which violates Open-Close*/
    }

    public static void makePayment(String paymentType) throws InvalidAlgorithmParameterException {
        switch (paymentType) {
            case "UPI" -> log.info("Paying through UPI");
            case "CARD" -> log.info("Paying through DebitCard");
            case "NETBANKING" -> log.info("Paying through NetBanking");
            default -> throw new InvalidAlgorithmParameterException("This payment type is not acceptable");
        }
    }
}

