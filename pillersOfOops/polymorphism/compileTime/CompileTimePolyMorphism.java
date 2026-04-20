package pillersOfOops.polymorphism.compileTime;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CompileTimePolyMorphism {
    public static void main(String[] args) {
        log.info("add with 2 number {}", add(1,2));
        log.info("add with 3 numbers {}", add(1,2,3));
    }
    /*Method overloading*/
    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }
}
