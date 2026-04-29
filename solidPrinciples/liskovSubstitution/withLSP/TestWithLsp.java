package solidPrinciples.liskovSubstitution.withLSP;

public class TestWithLsp {
    public static void main(String[] args) {
        /*with parent instance also it works fine*/
        Bird parrotParent = new Parrot();
        activate(parrotParent);
        Bird penguinParent = new Penguin();
        activate(penguinParent);

      /*With Child instance substitution still works fine*/
        Parrot parrot = new Parrot();
        activate(parrot);
        Penguin penguin = new Penguin();
        activate(penguin);
    }

    public static void activate(Bird bird){
        bird.eat();
        if(bird instanceof FlyingBirds flyingBird)/*this will cast the object to that type if it is compatible*/
            flyingBird.fly(); /*fly is not enforced to penguin now so, it don't have this behaviour at all*/

        /*So here we have fly behavior on the flying birds only so child can represent the parents like
        * Parrot --> Bird
        * Penguin --> Bird or FlyingBird
        * */
    }
}
