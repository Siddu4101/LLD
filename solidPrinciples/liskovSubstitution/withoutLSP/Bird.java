package solidPrinciples.liskovSubstitution.withoutLSP;

import lombok.extern.slf4j.Slf4j;

import javax.naming.OperationNotSupportedException;

@Slf4j
public abstract class Bird {
    public void eat(){
        log.info("bird will eta something");
    }

    public void fly() throws OperationNotSupportedException{
        log.info("Bird may fly");
    }
}
