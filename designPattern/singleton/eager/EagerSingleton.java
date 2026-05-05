package designPattern.singleton.eager;

import lombok.extern.slf4j.Slf4j;

/*
* here we will create the object as a part of declaration of the static instance var
* When JVM loads this class it creates the instance even u call some other static method in this class
* it loads the class and creates the instance of it
*  Pros:
*       easier to create
*       no synchronization needed
*       no if else
*       thread safe by default
*  Cons:
*       even not used the object will be created
*       if object is heavy waste of memory and memory leak may happen
* */
@Slf4j
public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton(); /*initialization and private static instance*/

    private EagerSingleton(){
        log.info("Test");
    }/*private constructor*/

    public static EagerSingleton getInstance(){ /*to access instance from outside we have public method*/
        return INSTANCE;
    }
}
