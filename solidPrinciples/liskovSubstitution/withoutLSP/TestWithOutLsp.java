package solidPrinciples.liskovSubstitution.withoutLSP;


import javax.naming.OperationNotSupportedException;

public class TestWithOutLsp {
    public static void main(String[] args) throws OperationNotSupportedException {
        /*with parent instance it works fine*/
        Bird parrotParent = new Parrot();
        activate(parrotParent);
        Bird penguinParent = new Penguin();
        activate(penguinParent);/*This will make it fail as Penguin don't have that functionality(it is present with exception)*/
    }

    public static void activate(Bird bird) throws OperationNotSupportedException {
        bird.eat();
        bird.fly();/*We are saying all birds can fly and in the child we are saying it is not (via exception) which is wrong*/
        /*So here actually he child is not a correct substitution for the parent place
        * parrot --> Bird ✅
        * penguin --> Bird ❌ (fly is present in parent but child throws exception in it not correct)
        * */
    }
}
