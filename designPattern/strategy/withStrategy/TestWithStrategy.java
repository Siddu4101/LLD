package designPattern.strategy.withStrategy;

public class TestWithStrategy {

    public static void main(String[] args) {
        /*Using strategy now we are following the Open-Close and new payment way u can add without any modification to existing classes*/
        PaymentType upi = new UPI();
        upi.pay();
        PaymentType card = new DebitCard();
        card.pay();
        PaymentType netBanking = new NetBanking();
        netBanking.pay();
    }
}
