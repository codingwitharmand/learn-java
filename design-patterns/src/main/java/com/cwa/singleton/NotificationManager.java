package com.cwa.singleton;

import com.cwa.domain.NotificationType;
import com.cwa.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager {

    private static NotificationManager instance;
    List<NotificationObserver> observers = new ArrayList<>();

    private NotificationManager() {}

    public static NotificationManager getInstance() {
        if(instance == null) {
            instance = new NotificationManager();
        }
        return instance;
    }

    public void addObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(NotificationObserver observer) {
        observers.remove(observer);
    }

    public void notify(String message, NotificationType type) {
        for(NotificationObserver observer : observers) {
            observer.update(message, type);
        }
    }
}
