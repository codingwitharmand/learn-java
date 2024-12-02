package com.cwa.strategy;

public class JSONNotificationStrategy implements NotificationStrategy {
    @Override
    public String formatMessage(String message) {
        return "{\"message\":\"" + message + "\"}";
    }
}
