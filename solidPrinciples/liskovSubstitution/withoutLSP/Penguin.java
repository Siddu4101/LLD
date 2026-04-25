package solidPrinciples.liskovSubstitution.withoutLSP;

import lombok.extern.slf4j.Slf4j;

import javax.naming.OperationNotSupportedException;

@Slf4j
public class Penguin extends Bird {

    /*There is no need penguin to implement fly and mention it can't fly just by segregation the abstract layers*/
    @Override
    public void eat() {
        log.info("Penguin eating fish...");
    }

    @Override
    public void fly() throws OperationNotSupportedException {
        throw new OperationNotSupportedException("I am penguin i can't fly");
    }
}
