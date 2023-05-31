package designPattern.creationPatterns.abstractFactory.sms;

import designPattern.creationPatterns.abstractFactory.Notification;

public class Vodafone implements Notification {
    @Override
    public void send(String userId) {
        System.out.println("Vodaphone.send "+userId);
    }
}
