package designPattern.observer;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class CoderArmyChannel implements IYoutubeChannel {
  private final List<ISubscriber> subscriberList = new ArrayList<>();
    @Override
    public void subscribe(ISubscriber subscriber) {
        subscriberList.add(subscriber);
        log.info("added new subscriber {} to coder-army channel", subscriber);
    }

    @Override
    public void unSubscribe(ISubscriber subscriber) {
        subscriberList.remove(subscriber);
        log.info("removed subscriber {} from coder-army channel", subscriber);
    }

    @Override
    public void addVideo(String video) {
        log.info("New video: {} added to coder-army", video);
        notifySubscribers(video);
    }

    private void notifySubscribers(String video) {
        for(ISubscriber s : subscriberList){
            s.update(video);
        }
        log.info("notification sent to subscribers...");
    }
}
