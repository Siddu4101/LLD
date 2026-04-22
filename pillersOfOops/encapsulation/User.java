package pillersOfOops.encapsulation;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
public class User {
    /*Properties*/
    /*without encapsulation*/
    public int publicAge = 10;/*This can be changed by anybody*/

    private int age = 10;/*only setAge(controlled method) can change it*/

    /*Behaviours*/
    public int getPublicAge(){
        return publicAge;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        if(age <= 100 && age >= 0)/*control*/
            this.age = age;
    }

    public void sayHello(){
        log.info("Hello from user");
    }
}
