package accessModifiers.protectedAccessModifier;

import accessModifiers.protectedAccessModifier.Protected;

/*Testing Access of protected members from different package subclass*/
public class SamePackageSubClass extends Protected {

    public SamePackageSubClass(){
        super();/*accessing parent class protected constructor in subclass of different package*/
    }
    public static void main(String[] args) {
        /*all are in the same package so accessible directly via same/parent class itself no need of subclass/inheritance */
        Protected aProtected = new Protected();
        aProtected.age = 100;
        aProtected.sayHello();
        Protected.InnerClass innerClass = aProtected.new InnerClass();
        innerClass.name = "Raj";
        aProtected.age = 100;

        /*With SubCLass instance we can access all the protected members*/
        SamePackageSubClass samePackageSubClass = new SamePackageSubClass();/*subclass instance*/
        samePackageSubClass.age = 100;
        samePackageSubClass.sayHello();/*can access protected methods*/
        InnerClass innerClassViaSubClass = samePackageSubClass.new InnerClass();
        innerClassViaSubClass.name = "Viju";
    }

}


