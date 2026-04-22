package pillersOfOops.abstractions.viaInterface;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestInterfaceImplFunctionality {
    public static void main(String[] args) {
        IPayment upi = new UPI();/*IPayment interface can hold children instance and run time polymorphism calls correct implementation based on the underlying instance  */
        upi.pay();
        IPayment netBanking = new NetBanking();
        netBanking.pay();
        IPayment card = new Card();
        card.pay();
    }
}
