package designPattern.factory.simple;

public class TestSimpleFactory {

    public static void main(String[] args) {
        /*The factory is not following the Open-Close so we will go to factoryDesignPattern*/
        PaymentTypeFactory paymentTypeFactory = new PaymentTypeFactory();
        PaymentType upi = paymentTypeFactory.getPaymentMethod("UPI");
        upi.pay();
        PaymentType card = paymentTypeFactory.getPaymentMethod("CARD");
        card.pay();
    }
}
