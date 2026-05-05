package designPattern.observer;

public interface IYoutubeChannel {
   void subscribe(ISubscriber subscriber);
   void unSubscribe(ISubscriber subscriber);
   void addVideo(String video);
}
