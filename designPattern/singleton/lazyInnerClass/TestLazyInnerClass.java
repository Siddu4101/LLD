package designPattern.singleton.lazyInnerClass;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestLazyInnerClass {
    public static void main(String[] args) {
        LazyInnerClassSingleton instance1 = LazyInnerClassSingleton.getInstance();
        log.info("instance1 hashcode {}", instance1);

        LazyInnerClassSingleton instance2 = LazyInnerClassSingleton.getInstance();
        log.info("instance2 hashcode {}", instance2);

        log.info("is both instance are same {}", instance1 == instance2);
    }
}
