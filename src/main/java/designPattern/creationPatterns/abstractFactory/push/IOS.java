package designPattern.creationPatterns.abstractFactory.push;

import designPattern.creationPatterns.abstractFactory.Notification;

public class IOS implements Notification {
    @Override
    public void send(String userId) {
        System.out.println("IOS.send "+userId);
    }
}
