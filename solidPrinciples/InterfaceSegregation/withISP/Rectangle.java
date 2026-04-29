package solidPrinciples.InterfaceSegregation.withISP;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rectangle extends TwoDimensionalShape {
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
}
