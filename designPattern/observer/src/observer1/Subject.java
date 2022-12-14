package observer1;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者: 发布
 */
public class Subject {
    private final List<Observer> observers = new ArrayList<>();    //状态改变

    public void setMsg(String msg) {
        notifyAll(msg);
    }

    //订阅
    public void addAttach(Observer observer) {
        observers.add(observer);
    }

    //通知所有订阅的观察者    
    private void notifyAll(String msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}