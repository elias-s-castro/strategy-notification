package br.com.castro.strategynotification.service.strategy;

import br.com.castro.strategynotification.service.NotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TwitterNotificationStrategy implements NotificationStrategy {

    private static final Logger log = LoggerFactory.getLogger(TwitterNotificationStrategy.class);

    @Override
    public void sendNotification(String destination, String message) {
        log.info("Notificação [{}] enviada para o Twitter [{}]",
                message,destination);
    }
}
