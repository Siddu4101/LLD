package pillersOfOops.inheritance;

import lombok.extern.slf4j.Slf4j;

public class Hierarchical {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.numberOfTiers();

        Vehicle bike = new Bike();
        bike.start();
        bike.numberOfTiers();

        Vehicle car = new Car();
        car.start();
        car.numberOfTiers();
    }
}

@Slf4j
class Vehicle{
    public void start(){
        log.info("vehicle starts...");
    }

    public void numberOfTiers(){
        log.info("Number of tiers in Vehicle varies");
    }
}

@Slf4j
class Bike extends Vehicle{
    @Override
    public void numberOfTiers() {
        log.info("number of tiers in bike 2");
    }
}

@Slf4j
class Car extends Vehicle{
    @Override
    public void numberOfTiers() {
        log.info("number of tiers in car 4");
    }
}
