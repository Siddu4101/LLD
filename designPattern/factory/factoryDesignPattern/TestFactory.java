package designPattern.factory.factoryDesignPattern;

public class TestFactory {

    public static void main(String[] args) {
        /*This one helps to maintain the Open-Close*/
        PaymentTypeFactory upiFactory = new UPIFactory();
        PaymentType upi = upiFactory.getPaymentMethod();
        upi.pay();
        PaymentTypeFactory cardFactory = new CardFactory();
        PaymentType card =  cardFactory.getPaymentMethod();
        card.pay();
    }
}
