package ObserverPattern;

import java.util.ArrayList;

public class ObservableInstance implements Observable {

    ArrayList<Observer> observers;
    String name;

    ObservableInstance(String name){
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach((e)-> e.notify(name));
    }
}
