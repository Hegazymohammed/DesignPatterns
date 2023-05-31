package designPattern.creationPatterns.factory;

import designPattern.creationPatterns.abstractFactory.Notification;

import java.util.Objects;

public class NotificationFActory {
    private static final Notification voda=new Vodafone();
    private  static final Notification Orang=new Orange();
    private static final Notification we=new We();
    public static Notification provider(String phone){
        Objects.requireNonNull(phone);
        if(phone.startsWith("010"))
            return voda;
        else if(phone.startsWith("015"))
            return Orang;
        else if(phone.startsWith("015"))
            return we;
        else
            return voda;
    }
}
