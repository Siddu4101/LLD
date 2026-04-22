package pillersOfOops.abstractions.viaAbstractClass;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class APayment {
    abstract void pay();/*interface methods are by default public*/
    public void simpleNonAbstractMethod(){
        log.info("Hey I am simple non abstract method");
    }
}
