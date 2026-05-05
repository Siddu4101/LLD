package designPattern.factory.abstractDesignPattern;


public class InternationalPaymentFactory implements PaymentTypeFactory {
    @Override
    public OnlinePaymentType getOnlinePaymentMethod() {
        return new Card();
    }

    @Override
    public OfflinePaymentType getOfflinePaymentMethod() {
        return new Cheque();
    }
}
