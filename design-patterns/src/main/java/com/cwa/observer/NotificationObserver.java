package com.cwa.observer;

import com.cwa.domain.NotificationType;

public interface NotificationObserver {
    void update(String message, NotificationType type);
}
