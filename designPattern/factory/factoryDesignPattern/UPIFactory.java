package designPattern.factory.factoryDesignPattern;


public class UPIFactory implements PaymentTypeFactory{
    @Override
    public PaymentType getPaymentMethod() {
        return new UPI();
    }
}
