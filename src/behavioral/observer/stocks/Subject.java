package src.behavioral.observer.stocks;

public interface Subject {

    void addBroker(Observer observer);
    void removeBroker(Observer observer);
    void updateAll(String stockName, double price);

}
