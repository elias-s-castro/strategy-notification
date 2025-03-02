package br.com.castro.strategynotification.service;

public interface NotificationStrategy {

    void sendNotification(String destination, String message);
}
