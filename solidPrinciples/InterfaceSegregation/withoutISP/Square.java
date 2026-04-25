package solidPrinciples.InterfaceSegregation.withoutISP;

import lombok.extern.slf4j.Slf4j;

import javax.naming.OperationNotSupportedException;

@Slf4j
public class Square extends Shape{
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void area() {
        log.info("Area of square is {}", Math.pow(side,2));
    }

    @Override
    public void volume() throws OperationNotSupportedException {
        throw new OperationNotSupportedException("I am 2D figure don't have volume");
    }
}
