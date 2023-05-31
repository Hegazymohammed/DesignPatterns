package designPattern.creationPatterns.abstractFactory.sms;

import designPattern.creationPatterns.abstractFactory.Notification;
import designPattern.creationPatterns.abstractFactory.ParentFactory;

import java.util.Objects;

public class SMSFActory implements ParentFactory {
    private static final Notification voda=new Vodafone();
    private  static final Notification Orang=new Orange();
    private static final Notification we=new We();
    public   Notification provider(String phone){
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
