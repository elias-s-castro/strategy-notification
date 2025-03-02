package br.com.castro.strategynotification.service.strategy;

import br.com.castro.strategynotification.service.NotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiscordNotificationStrategy implements NotificationStrategy {

    private static final Logger log = LoggerFactory.getLogger(DiscordNotificationStrategy.class);

    @Override
    public void sendNotification(String destination, String message) {
        log.info("Notificação [{}] enviada para o Discord [{}]",
                message,destination);
    }
}
