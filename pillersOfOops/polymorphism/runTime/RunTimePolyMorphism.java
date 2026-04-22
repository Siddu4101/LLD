package pillersOfOops.polymorphism.runTime;

import lombok.extern.slf4j.Slf4j;

public class RunTimePolyMorphism {
    public static void main(String[] args) {
        Animal dog = new Dog();  /*based on the instance it calls the method if child implements it that is the preference else from parent*/
        dog.SayHello();/* woof woof*/
    }

}
@Slf4j
class Animal{
     public void SayHello(){
         log.info("Hello from animal!");
     }
}

@Slf4j
class Dog extends Animal{
    /*method overriding*/
    @Override
    public void SayHello() {
        log.info("Woof Woof");
    }
}
