package designPattern.creationPatterns.abstractFactory.push;

import designPattern.creationPatterns.abstractFactory.Notification;

public class Huawei implements Notification {
    @Override
    public void send(String userId) {

        System.out.println("Huawei .send " + userId);
    }
}
