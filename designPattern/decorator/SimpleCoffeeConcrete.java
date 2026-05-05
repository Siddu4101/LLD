package designPattern.decorator;

public class SimpleCoffeeConcrete implements CoffeeComponent{
    @Override
    public int price() {
        return  50;
    }

    @Override
    public String description() {
        return "Simple coffee";
    }
}
