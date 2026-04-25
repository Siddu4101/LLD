package solidPrinciples.liskovSubstitution.withLSP;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Bird {
    public void eat(){
        log.info("bird will eta something");
    }

}
