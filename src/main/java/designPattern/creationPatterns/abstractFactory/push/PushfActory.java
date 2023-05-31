package designPattern.creationPatterns.abstractFactory.push;

import designPattern.creationPatterns.abstractFactory.Notification;
import designPattern.creationPatterns.abstractFactory.ParentFactory;

import java.util.Objects;

public class PushfActory implements ParentFactory {
    private static final  Google GOOGLE =new Google();
    private  static final Notification HWAWIE=new Huawei();
    private static final Notification Ios=new IOS();
    public   Notification provider(String tokens){
       tokens=tokens.toUpperCase();
        Objects.requireNonNull(tokens);
        if(tokens.startsWith("G"))
            return GOOGLE;
        else if(tokens.startsWith("H"))
            return HWAWIE;
        else if(tokens.startsWith("I"))
            return Ios;
        else
            return null;
    }
}
