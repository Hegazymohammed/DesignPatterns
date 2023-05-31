package designPattern.creationPatterns.factory;

import designPattern.creationPatterns.abstractFactory.Notification;

public class Vodafone implements Notification {
    @Override
    public void send(String userId) {
        System.out.println("Vodaphone.send "+userId);
    }
}
