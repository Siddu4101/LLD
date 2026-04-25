package solidPrinciples.liskovSubstitution.withLSP;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class FlyingBirds extends Bird{

    public void fly(){
        log.info("Bird may fly");
    }

}
