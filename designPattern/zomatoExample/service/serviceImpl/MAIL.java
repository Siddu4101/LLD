package designPattern.zomatoExample.service.serviceImpl;

import designPattern.zomatoExample.client.User;
import designPattern.zomatoExample.service.Notification;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MAIL implements Notification {
    @Override
    public void sendNotification(User user, String message) {
        log.info("Sending notification: for user mail.id{} with the message {}", user.getUserInfo().getMailId(), message);
    }
}
