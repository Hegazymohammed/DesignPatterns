package designPattern.creationPatterns.abstractFactory;
/*
I have multiple SmS provider ,and i need to send multiple Customers with optimized cose
this is a contract
 */
public interface Notification {
    void send(String userId);
}
