package designPattern.behavioral;

public class ConcreteObserver implements  Observer{
    private int value;
    private final Subject subject;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }


    @Override
    public void update(int value ) {
        this.value=value;
        display();
    }



    public void display(){
        System.out.println("Value :"+value);
    }
}
