package com.cwa;

import com.cwa.domain.Notification;
import com.cwa.domain.NotificationType;
import com.cwa.factory.NotificationFactory;
import com.cwa.observer.EmailNotificationObserver;
import com.cwa.observer.PushNotificationObserver;
import com.cwa.observer.SMSNotificationObserver;
import com.cwa.singleton.NotificationManager;

public class Main {
    public static void main(String[] args) {
        NotificationManager manager = NotificationManager.getInstance();
        manager.addObserver(new EmailNotificationObserver());
        manager.addObserver(new SMSNotificationObserver());
        manager.addObserver(new PushNotificationObserver());

        Notification urgentNotification = NotificationFactory.createNotification("System failure detected!", NotificationType.URGENT);
        Notification infoNotification = NotificationFactory.createNotification("Daily backup completed successfully", NotificationType.INFO);
        Notification marketingNotification = NotificationFactory.createNotification("New features available", NotificationType.MARKETING);

        urgentNotification.send();
        System.out.println("********************");
        infoNotification.send();
        System.out.println("********************");
        marketingNotification.send();
    }
}