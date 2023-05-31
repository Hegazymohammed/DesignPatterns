package designPattern.creationPatterns.abstractFactory;

import designPattern.creationPatterns.abstractFactory.push.PushfActory;
import designPattern.creationPatterns.abstractFactory.sms.SMSFActory;

public class GenericFactory {
    public static final ParentFactory PUSHF_FACTORY =new PushfActory();
    public static final ParentFactory SMSF_FACTORY=new SMSFActory();
    public static ParentFactory factory(boolean mobile){
        if(mobile)
            return PUSHF_FACTORY;
        else
            return SMSF_FACTORY;
    }
}
