package designPattern.decorator;

public class CreamDecorator extends CoffeeDecorator{
    protected CreamDecorator(CoffeeComponent coffeeComponent) {
        super(coffeeComponent);
    }

    @Override
    public int price() {
        return coffeeComponent.price() +15;
    }

    @Override
    public String description() {
        return coffeeComponent.description() + " with Cream";
    }
}
