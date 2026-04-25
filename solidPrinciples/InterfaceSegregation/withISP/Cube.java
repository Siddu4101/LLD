package solidPrinciples.InterfaceSegregation.withISP;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cube extends ThreeDimensionalShape {
    int side;

    public Cube(int side) {
        this.side = side;
    }

    @Override
    public void area() {
        log.info("Area of a cube is {}", 6 * Math.pow(side,2));
    }

    @Override
    public void volume(){
        log.info("Volume of cube is {}", Math.pow(side,3));
    }
}
