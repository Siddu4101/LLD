package designPattern.singleton.lazy;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class TestLazy {
    public static void main(String[] args) {
        LazySingleton instance1 = LazySingleton.getInstance();
        log.info("instance1 hashcode {}", instance1);

        LazySingleton instance2 = LazySingleton.getInstance();
        log.info("instance2 hashcode {}", instance2);

        log.info("is both instance are same {}", instance1 == instance2);
    }
}
