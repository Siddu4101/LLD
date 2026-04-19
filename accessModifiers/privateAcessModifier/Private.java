package accessModifiers.privateAcessModifier;


/*
* 1. private: except outer-class we can apply to all(inner-class, field, constructor, method)
* 2. accessible only within the class
* 3. why private is not applicable to outClass? ==> if outer-class is private we can't create a instance of it becomes
*    useless and even the inner static methods also not accessible with class name as class itself private
* */

public class Private {
    private int age = 24;/*var as private*/

    private Private(){/*private constructor: used for singleton design pattern*/
        System.out.println("private constructor");
    }

    private void sayHello(){/*method as private*/
        System.out.println("Hello !");
    }

     private class InnerClass{ /*private inner class*/
        private String name = "Sid";
    }
}