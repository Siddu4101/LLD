package accessModifiers.publicAcessModifier;


/*
* 1. public: can be applied to all (class, field, constructor, method)
* 2. accessible from anywhere
* */

public class Public { /*class can be public*/
    public int age = 24;/*var as public*/

    public Public(){/*public constructor*/
        System.out.println("public constructor");
    }

    public void sayHello(){/*method as public*/
        System.out.println("Hello !");
    }
}