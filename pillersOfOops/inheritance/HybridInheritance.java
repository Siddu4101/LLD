package pillersOfOops.inheritance;

import lombok.extern.slf4j.Slf4j;

/*Combination of any 2 or more inheritance*/
public class HybridInheritance {
    public static void main(String[] args) {
        ExtrOrdinaryMan extrOrdinaryMan = new ExtrOrdinaryMan();
        extrOrdinaryMan.manPower();
        extrOrdinaryMan.superHeroPower();
        extrOrdinaryMan.sayHello();
    }
}

@Slf4j
class ExtrOrdinaryMan extends Animal implements Man, SuperHero{

    @Override
    public void manPower() {
        log.info("This is the hybrid inheritance man (multiple + simple)");
    }

    @Override
    public void superHeroPower() {
        log.info("This is the hybrid inheritance man (multiple + simple)");
    }
}


