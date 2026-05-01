package designPattern.factory.abstractDesignPattern;

public class TestFactory {

    public static void main(String[] args) {
        /*
        * Here we have multiple products
        *   1. OnlinePayment (UPI + CARD)
        *   2. OfflinePayment (CASH + CHEQUE)
        * family of products
        *   1. IndianPayment
        *   2. InternationalPayment
        * multiple factories serving the each family for multiple products
        *   1. IndianPaymentFactory (UPI + CASH)
        *   2. InternationalFactory (CARD + CHEQUE)
        * */
        PaymentTypeFactory indianPaymentFactory = new IndianPaymentFactory();
        OnlinePaymentType upi = indianPaymentFactory.getOnlinePaymentMethod();
        upi.pay();
        OfflinePaymentType cash = indianPaymentFactory.getOfflinePaymentMethod();
        cash.pay();

        PaymentTypeFactory  internationalPaymentFactory= new InternationalPaymentFactory();
        OnlinePaymentType card =  internationalPaymentFactory.getOnlinePaymentMethod();
        card.pay();
        OfflinePaymentType cheque = internationalPaymentFactory.getOfflinePaymentMethod();
        cheque.pay();
    }
}
