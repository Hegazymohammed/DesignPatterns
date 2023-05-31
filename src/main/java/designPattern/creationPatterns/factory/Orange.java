package designPattern.creationPatterns.factory;

import designPattern.creationPatterns.abstractFactory.Notification;

public class Orange implements Notification {
    @Override
    public void send(String userId) {

        System.out.println("Orange.send "+userId);
    }
}
