package Behavior_Mode.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @class: Subject
 * @description:
 * @author: dudg
 * @create: 2022-07-18 13:41
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
