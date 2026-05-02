package designPattern.decorator;

public abstract class CoffeeDecorator implements CoffeeComponent {
    protected final CoffeeComponent coffeeComponent;

    protected CoffeeDecorator(CoffeeComponent coffeeComponent) {
        this.coffeeComponent = coffeeComponent;
    }

}
