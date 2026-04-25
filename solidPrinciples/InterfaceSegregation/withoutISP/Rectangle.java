package solidPrinciples.InterfaceSegregation.withoutISP;

import lombok.extern.slf4j.Slf4j;

import javax.naming.OperationNotSupportedException;

@Slf4j
public class Rectangle extends Shape{
    int height;
    int width;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void area() {
        log.info("Area of rectangle is {}", height*width);
    }

    @Override
    public void volume() throws OperationNotSupportedException {
        throw new OperationNotSupportedException("I am 2D figure don't have volume");
    }
}
