package designPattern.observer;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
public class Subscriber implements ISubscriber{
    private final String name;
    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String video) {
        log.info("Hey {} Please do watch new video {} is out now",name, video);
    }
}
