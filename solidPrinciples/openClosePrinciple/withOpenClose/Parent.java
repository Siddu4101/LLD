package solidPrinciples.openClosePrinciple.withOpenClose;

public class Parent {
    void hello(Child name){
        System.out.println("Hello "+name);
    }
}


class Child extends Parent{
    void hello(Parent name) {
        System.out.println("");
    }

}
