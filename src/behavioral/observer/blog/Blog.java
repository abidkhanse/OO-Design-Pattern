package src.behavioral.observer.blog;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Subject{

    private List<Observer> list;

    public Blog() {
        list = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {

        for (Observer ob : list) {
            ob.update(message);
        }

    }

}
