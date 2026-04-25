package solidPrinciples.InterfaceSegregation.withoutISP;

import javax.naming.OperationNotSupportedException;

public class TestWithoutISP {
    public static void main(String[] args) throws OperationNotSupportedException {
        Shape cube = new Cube(2);
        cube.area();
        cube.volume();

        Shape square = new Square(2);
        square.area();
        square.volume();/*This fails as it is 2D figure*/

        Shape rectangle = new Rectangle(2, 2);
        rectangle.area();
        rectangle.volume();/*This fails as it is a 2D figure*/
    }
}
