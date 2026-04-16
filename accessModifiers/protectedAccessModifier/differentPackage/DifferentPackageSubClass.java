package accessModifiers.protectedAccessModifier.differentPackage;

import accessModifiers.protectedAccessModifier.Protected;

/*Testing Access of protected members from different package subclass*/
public class DifferentPackageSubClass extends Protected {

    public DifferentPackageSubClass(){
        super();/*accessing parent class protected constructor in subclass of different package*/
    }
    public static void main(String[] args) {
/*If it try with Actual class it won't work in different package i need subclass instance*/
/*
        Protected aProtected = new Protected();
        aProtected.age = 100;*//*not accessible through same class instance in different package*//*
        aProtected.sayHello();*//*no access to protected method*//*
        Protected.InnerClass  innerClass = aProtected.new InnerClass();*//*not possible to create instance of inner class*//*
        innerClass.name = "Raj"; *//*can't modifier inner field protected field*//*
        aProtected.age = 100;*//*not possible to access the age as protected
*/

        /*With SubCLass instance we can access all the protectes members*/
        DifferentPackageSubClass differentPackageSubClass = new DifferentPackageSubClass();/*subclass instance*/
        differentPackageSubClass.age = 100;
        differentPackageSubClass.sayHello();/*can access protected methods*/
//        InnerClass innerClass = differentPackageSubClass.new InnerClass();/*This won't work as this is the class again to access this u need it's subclass whichi u can't make on this class
//         as no multi inheritance possible if u want to create instance create it via method in Protected and call that method here for instance*/

    }

}


