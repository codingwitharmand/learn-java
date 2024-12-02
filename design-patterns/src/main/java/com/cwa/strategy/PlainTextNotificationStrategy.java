package com.cwa.strategy;

public class PlainTextNotificationStrategy implements NotificationStrategy {
    @Override
    public String formatMessage(String message) {
        return message;
    }
}
