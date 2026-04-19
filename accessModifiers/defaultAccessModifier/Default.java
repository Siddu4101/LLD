package accessModifiers.defaultAccessModifier;

/*
 * 1. default: applicable to all(class, field, constructor, method)
 * 2. accessible to sameClass, samePackage, samePackage subClass
 * */
class Default { /*default class access*/

   Default(){/*default constructor access*/
       System.out.println("default constructor");
   }

   int age = 25; /*default var access*/

   void sayHello(){/*default method access*/
       System.out.println("Hello !");
   }

   class InnerClass{/*default inner class access*/
       String name = "Sid";
   }

}
