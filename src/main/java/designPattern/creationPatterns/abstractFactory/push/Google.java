package designPattern.creationPatterns.abstractFactory.push;

import designPattern.creationPatterns.abstractFactory.Notification;

public class Google implements Notification {
    @Override
    public void send(String userId) {

        System.out.println("Google.send "+userId);
    }
}
