package com.cwa.factory;

import com.cwa.domain.*;
import com.cwa.strategy.HTMLNotificationStrategy;
import com.cwa.strategy.JSONNotificationStrategy;
import com.cwa.strategy.PlainTextNotificationStrategy;

public class NotificationFactory {

    public static Notification createNotification(String message, NotificationType type) {
        return switch(type) {
            case URGENT -> new UrgentNotification(message, new JSONNotificationStrategy());
            case INFO -> new InfoNotification(message, new PlainTextNotificationStrategy());
            case MARKETING -> new MarketingNotification(message, new HTMLNotificationStrategy());
        };
    }
}
