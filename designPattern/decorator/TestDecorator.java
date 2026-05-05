package designPattern.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestDecorator {
    public static void main(String[] args) {
        CoffeeComponent coffee = new SimpleCoffeeConcrete();
        log.info("Prepared {}, and it's price is {}", coffee.description(), coffee.price());

        /*prepare milk sugar less coffee*/
        CoffeeComponent milkSugarLessCoffee = new MilkDecorator(coffee);
        log.info("Prepared {}, and it's price is {}",milkSugarLessCoffee.description(), milkSugarLessCoffee.price());

        /*coffee with sugar + milk + cream*/
        CoffeeComponent creamySugarMilkedCoffee = new CreamDecorator(new MilkDecorator(new SugarDecorator(coffee)));
        log.info("Prepared {}, and it's price is {}",creamySugarMilkedCoffee.description(), creamySugarMilkedCoffee.price());
    }
}
