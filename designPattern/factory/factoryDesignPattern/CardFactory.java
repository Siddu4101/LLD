package designPattern.factory.factoryDesignPattern;


public class CardFactory implements PaymentTypeFactory{
    @Override
    public PaymentType getPaymentMethod() {
        return new Card();
    }
}
