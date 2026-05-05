package designPattern.factory.abstractDesignPattern;


public interface PaymentTypeFactory {
    OnlinePaymentType getOnlinePaymentMethod();
    OfflinePaymentType getOfflinePaymentMethod();
}
