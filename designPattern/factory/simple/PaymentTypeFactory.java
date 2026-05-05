package designPattern.factory.simple;

public class PaymentTypeFactory {
    public PaymentType getPaymentMethod(String type){
        if(type.equals("UPI"))
            return new UPI();
        else if(type.equals("CARD"))
            return new Card();
        else
            return null;
    }
}
