package designPattern.singleton.enumSingleton;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class TestEnum {
    public static void main(String[] args) {
        SingletonEnum instance1 = SingletonEnum.INSTANCE;
        log.info("instance1 hashcode {}", instance1);

        SingletonEnum instance2 = SingletonEnum.INSTANCE;
        log.info("instance2 hashcode {}", instance2);

        log.info("is both instance are same {}", instance1 == instance2);
    }
}
