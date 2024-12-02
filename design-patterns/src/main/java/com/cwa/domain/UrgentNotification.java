package com.cwa.domain;

import com.cwa.singleton.NotificationManager;
import com.cwa.strategy.NotificationStrategy;

public class UrgentNotification extends Notification {

    public UrgentNotification(String message, NotificationStrategy strategy) {
        super(message, strategy);
    }

    @Override
    public void send() {
        String formattedMessage = getStrategy().formatMessage("[URGENT] " + getMessage());
        NotificationManager.getInstance().notify(formattedMessage, NotificationType.URGENT);
    }
}
