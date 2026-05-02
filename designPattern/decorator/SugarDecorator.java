package designPattern.decorator;

public class SugarDecorator extends CoffeeDecorator{
    protected SugarDecorator(CoffeeComponent coffeeComponent) {
        super(coffeeComponent);
    }

    @Override
    public int price() {
        return coffeeComponent.price() + 5;
    }

    @Override
    public String description() {
        return coffeeComponent.description() + " with Sugar";
    }
}
