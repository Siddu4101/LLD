package designPattern.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestObserver {
    public static void main(String[] args) {
        IYoutubeChannel coderArmyChannel = new CoderArmyChannel();
        ISubscriber sid = new Subscriber("Sid");
        ISubscriber raj = new Subscriber("Raj");

        /*subscribe to coder-army*/
        coderArmyChannel.subscribe(sid);
        coderArmyChannel.subscribe(raj);

        /*publish new video which inter publishes the notify to subscriber*/
        coderArmyChannel.addVideo("Observer design pattern!!!");

        /*remove one of the subscriber and post new video and check is it publishing to only correct subscribers*/
        coderArmyChannel.unSubscribe(raj);

        /*new video*/
        coderArmyChannel.addVideo("Decorator design pattern!!!");
    }
}
