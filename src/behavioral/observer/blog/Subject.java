package src.behavioral.observer.blog;

public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(String message);

}
