package com.cwa.domain;

import com.cwa.singleton.NotificationManager;
import com.cwa.strategy.NotificationStrategy;

public class InfoNotification extends Notification {

    public InfoNotification(String message, NotificationStrategy strategy) {
        super(message, strategy);
    }

    @Override
    public void send() {
        String formattedMessage = getStrategy().formatMessage("[INFO] " + getMessage());
        NotificationManager.getInstance().notify(formattedMessage, NotificationType.INFO);
    }
}
