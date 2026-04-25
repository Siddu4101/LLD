package solidPrinciples.liskovSubstitution.withLSP;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Penguin extends Bird{

    /*There is no need penguin to implement fly and mention it can't fly just by segregation the abstract layers*/
    @Override
    public void eat() {
        log.info("Penguin eating fish...");
    }
}
