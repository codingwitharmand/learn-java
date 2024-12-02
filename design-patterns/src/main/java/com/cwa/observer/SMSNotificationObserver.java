package com.cwa.observer;

import com.cwa.domain.NotificationType;

public class SMSNotificationObserver implements NotificationObserver {
    @Override
    public void update(String message, NotificationType type) {
        System.out.println("Sending SMS: " + message);
    }
}
