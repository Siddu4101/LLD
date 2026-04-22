package pillersOfOops.inheritance;

import lombok.extern.slf4j.Slf4j;

/*THis we can't achieve via classes as we face diamond problem*/
@Slf4j
public class MultipleInheritanceViaInterface {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        superMan.manPower();
        superMan.superHeroPower();
    }
}

interface Man{
    void manPower();
}

interface SuperHero{
    void superHeroPower();
}

@Slf4j
class SuperMan implements Man, SuperHero{

    @Override
    public void manPower() {
        log.info("Have man power");
    }

    @Override
    public void superHeroPower() {
        log.info("Have superhero powers");
    }
}