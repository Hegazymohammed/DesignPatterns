package designPattern.behavioral;

import java.util.List;

public class ConcreteSubject implements Subject{
    private List<Observer> observers;
    private int value=0;
    @Override
    public void addObserver(Observer observer) {
            this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
                observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
            for(Observer observer:observers)
                observer.update(value);
    }

    @Override
    public void setValue(int value) {
            this.value=value;
            notifyObservers();
    }
}
