package designPattern.creationPatterns.abstractFactory.sms;

import designPattern.creationPatterns.abstractFactory.Notification;

public class We implements Notification {
    @Override
    public void send(String userId) {

        System.out.println("WE.send " + userId);
    }
}
