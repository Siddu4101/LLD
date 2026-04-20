package pillersOfOops.abstractions.viaAbstractClass;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestAbstractClassImplFunctionality {
    public static void main(String[] args) {
        APayment upi = new UPI();/*APayment abstract class can hold children instance and run time polymorphism calls correct implementation based on the underlying instance  */
        upi.pay();
        APayment netBanking = new NetBanking();
        netBanking.pay();
        APayment card = new Card();
        card.pay();
    }
}
