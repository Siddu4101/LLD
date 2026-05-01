package designPattern.factory.abstractDesignPattern;


public class IndianPaymentFactory implements PaymentTypeFactory {
    @Override
    public OnlinePaymentType getOnlinePaymentMethod() {
        return new UPI();
    }

    @Override
    public OfflinePaymentType getOfflinePaymentMethod() {
        return new Cash();
    }
}
