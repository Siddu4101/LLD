package designPattern.singleton.lazyInnerClass;

/*
* here we will create the object only if it is accessed atleast once
* it overcomes the Eager by avoiding the creation if not used atleast once
* Here u can use the outerclass without creating the instance u can call the other static methods
* which never creates the instance untill you call the getInstance so it is more better
* */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){}/*private constructor*/

    private static class LazyInner{
        private final static LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }

    public static LazyInnerClassSingleton getInstance(){ /*to access instance from outside we have public method*/
         return LazyInner.INSTANCE;
    }
}
