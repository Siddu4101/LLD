package pillersOfOops.encapsulation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestEnCapsulation {
    public static void main(String[] args) {
        User user = new User();
        user.publicAge = -10;/*no controls and it sets in valid age*/
//        user.age = -10;/*the age is private can't access here for setting*/
        user.setAge(-10);/*this is invalid number so it will ignore and preserve default valid value*/

        log.info("User info {}", user);
        user.sayHello();/*accessing behaviour*/
    }
}
