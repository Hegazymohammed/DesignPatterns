package designPattern.creationPatterns.abstractFactory.sms;

import designPattern.creationPatterns.abstractFactory.Notification;

public class Orange implements Notification {
    @Override
    public void send(String userId) {

        System.out.println("Orange.send "+userId);
    }
}
