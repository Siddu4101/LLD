package solidPrinciples.InterfaceSegregation.withISP;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Square extends TwoDimensionalShape {
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void area() {
        log.info("Area of square is {}", Math.pow(side,2));
    }
}
