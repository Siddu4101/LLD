package designPattern.zomatoExample.service;

import designPattern.zomatoExample.client.User;

public interface Notification {
    void sendNotification(User user, String message);
}
