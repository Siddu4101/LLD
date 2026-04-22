package pillersOfOops.inheritance;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Inheritance {
   /*
   * Inheritance: reusing the code(properties and behaviours) of parent in child
   * All the protected and public and default(if same package) properties and behaviours are inherited including the
   * final and inherited var and methods but these are not overridable but u can do the method or var hiding by declaring it again in subclass
   * we have 5 types
   * */

   static class Parent{
       /*Not inheritable*/
       public Parent(){
           log.info("This parent constructor is not inheritable");
       }
       private int nonInheritablePrivateVar = 12345;
       private void nonInheritablePrivateMethod(){
           log.info("This parent private method is not inheritable");
       }

       /*Inheritable items*/
        public String name = "Siddu";
        static int age = 24;
        final int score = 29;
        public void sayHello(){
            log.info("Hello from parent");
        }
        public static void inheritableStaticMethod(){
            log.info("This parent static method is inheritable but non-overridable");
        }
        public final void inheritableFinalMethod(){
            log.info("This parent final method is inheritable but non-overridable");
        }

        public void info(){
            log.info("Parent name {}, age {}, score {}, nonInheritablePrivateVar {}", name, age, score, nonInheritablePrivateVar);
        }
    }

    static class Child extends Parent{
        public void thingsFromParentInherited(){
            age = 40; /*overrides or updates parent instance as a static element */
//            score = 100; it's final can't change
            log.info("Child name {}, age {}, score {}", name, age, score);
            inheritableStaticMethod();/*inherited but can't override*/
            inheritableFinalMethod();/*inherited but can't override*/
        }
        public void sayBye(){ /*extra feature/add-on in child*/
            log.info("Bye from child");
        }

        public Child() {
            super(); /*u can't override parent constructor but can call it here*/
        }

        @Override
        public void sayHello() {
            super.sayHello(); /*public method overridable*/
        }

        @Override
        public void info() {
            super.info();/*public method overridable*/
        }
    }

    public static void main(String[] args) {
        /*Simple*/
        Parent parent = new Parent();
        parent.sayHello();
        parent.info();
        parent.nonInheritablePrivateMethod();/*non-inherited*/

        Child child = new Child();/*this will creates the parent instance first and then child once*/
        child.sayBye();
        child.thingsFromParentInherited();
        child.info();

    }
}
