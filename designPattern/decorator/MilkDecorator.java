package designPattern.decorator;

public class MilkDecorator extends CoffeeDecorator{
    protected MilkDecorator(CoffeeComponent coffeeComponent) {
        super(coffeeComponent);
    }

    @Override
    public int price() {
        return coffeeComponent.price() + 10;
    }

    @Override
    public String description() {
        return coffeeComponent.description() + " with Milk";
    }
}
