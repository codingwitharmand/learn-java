package com.cwa.domain;

import com.cwa.singleton.NotificationManager;
import com.cwa.strategy.NotificationStrategy;

public class MarketingNotification extends Notification {

    public MarketingNotification(String message, NotificationStrategy strategy) {
        super(message, strategy);
    }

    @Override
    public void send() {
        String formattedMessage = getStrategy().formatMessage("[MARKETING] " + getMessage());
        NotificationManager.getInstance().notify(formattedMessage, NotificationType.MARKETING);
    }
}
