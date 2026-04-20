package pillersOfOops.inheritance;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.surName();
    }
}

@Slf4j
class Parent{
    public Parent(){
        log.info("Parent constructor");
    }

    public void surName(){
        log.info("surname is pattanashetti");
    }
}

@Slf4j
class Child extends Parent{
    public Child(){
        log.info("Child constructor");
    }
}
