package solidPrinciples.liskovSubstitution.withoutLSP;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Parrot extends Bird {
    @Override
    public void fly() {
        log.info("parrot is flying in the sky");
    }

    @Override
    public void eat() {
        log.info("parrot eating chilly");
    }
}
