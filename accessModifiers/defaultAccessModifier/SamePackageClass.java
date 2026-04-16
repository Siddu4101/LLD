package accessModifiers.defaultAccessModifier;

public class SamePackageClass {

    public static void main(String[] args) {
        Default aDefault = new Default();
        aDefault.age = 100;
        aDefault.sayHello();
        Default.InnerClass innerClass = aDefault.new InnerClass();
        innerClass.name = "Raj";
        aDefault.age = 100;
    }

}


