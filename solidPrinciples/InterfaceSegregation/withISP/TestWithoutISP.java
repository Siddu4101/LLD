package solidPrinciples.InterfaceSegregation.withISP;



public class TestWithoutISP {
    public static void main(String[] args){
        ThreeDimensionalShape cube = new Cube(2);
        cube.area();
        cube.volume();

        /*Now there is no need to implement dummy or empty or with exception methods which are not needed in the
        * square and rectangle and these no more have the volume method in them by segregation*/
        TwoDimensionalShape square = new Square(2);
        square.area();

        TwoDimensionalShape rectangle = new Rectangle(2, 2);
        rectangle.area();
    }
}
