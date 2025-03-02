package br.com.castro.strategynotification.service;

import br.com.castro.strategynotification.service.strategy.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NotificationService {

    private final Map<String, NotificationStrategy> strategyMap = Map.of(
            "discord", new DiscordNotificationStrategy(),
            "instagram", new InstagramNotificationStrategy(),
            "twitter", new TwitterNotificationStrategy(),
            "email", new EmailNotificationStrategy(),
            "whatsapp", new WhatsappNotificationStrategy()
    );

    private static final Logger log = LoggerFactory.getLogger(NotificationService.class);

    public void notify(String channel, String destination, String message) {
        strategyMap.get(channel).sendNotification(destination, message);
    }


    // Método deixado para demonstrar como era feito antes
    /*
    public void notify(String channel, String destination, String message) {

        if(channel.equalsIgnoreCase("discord")) {
            log.info("Notificação [{}] enviada para o Discord [{}]",
                    message,destination);
        } else if (channel.equalsIgnoreCase("instagram")) {
            log.info("Notificação [{}] enviada para o Instagram [{}]",
                    message,destination);
        }else if (channel.equalsIgnoreCase("twitter")) {
            log.info("Notificação [{}] enviada para o Twitter [{}]",
                    message,destination);
        } else if (channel.equalsIgnoreCase("email")) {
            log.info("Notificação [{}] enviada para o Email [{}]",
                    message,destination);
        }else if (channel.equalsIgnoreCase("whatsapp")) {
            log.info("Notificação [{}] enviada para o Whatsapp [{}]",
                    message,destination);
        }else {
            throw new IllegalArgumentException("Channel not supported");
        }
    }
    */
}
