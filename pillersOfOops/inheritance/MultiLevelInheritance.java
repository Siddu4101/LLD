package pillersOfOops.inheritance;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sayHello();
        Animal dog  = new Dog();
        dog.sayHello();
        Animal lab = new LabDog();
        lab.sayHello();
    }
}

@Slf4j
class Animal{
    public Animal(){
        log.info("Animal constructor");
    }

    public void sayHello(){
        log.info("Animal Hello!");
    }
}

@Slf4j
class Dog extends Animal{

    @Override
    public void sayHello(){
        log.info("Bark Bark");
    }
}

@Slf4j
class LabDog extends Dog{
    @Override
    public void sayHello() {
        log.info("Woof Woof");
    }
}
