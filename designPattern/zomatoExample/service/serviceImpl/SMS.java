package designPattern.zomatoExample.service.serviceImpl;

import designPattern.zomatoExample.client.User;
import designPattern.zomatoExample.service.Notification;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SMS implements Notification {
    @Override
    public void sendNotification(User user, String message) {
        log.info("Sending notification: for user ph.no{} with the message {}", user.getUserInfo().getPhNo(), message);
    }
}
