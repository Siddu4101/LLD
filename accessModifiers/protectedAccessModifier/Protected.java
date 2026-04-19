package accessModifiers.protectedAccessModifier;


/*
 * 1. protected: except outer-class we can apply to all(inner-class, field, constructor, method)
 * 2. accessible to sameClass, samePackage, samePackage subClass, differentPackage subClass
 * 3. why outer class cannot be protected? ==> protected deals above access pattern but when we check last one differentPackage subClass
 *    if differentPackage wants to inherit  this it should be visible to that but as it is a protected class other class in different package can't
 *    access it for inheritance (subclass) and now it is this class can't become subclass to access it so this is the ambiguity so to resolve this we don't have
 *    it in java outer-class
 * */

public class Protected {
    protected int age = 24;/*var as protected*/

    protected Protected(){/*protected constructor: used for singleton design pattern*/
        System.out.println("protected constructor");
    }

    protected void sayHello(){/*method as protected*/
        System.out.println("Hello !");
    }

    protected class InnerClass{ /*protected inner class*/
        protected String name = "Sid";
    }
}

