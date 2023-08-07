package src.behavioral.observer.stocks;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject{

    List<Observer> brokers;

    public StockMarket() {
        brokers = new ArrayList<>();
    }

    @Override
    public void addBroker(Observer observer) {
        brokers.add(observer);
    }

    @Override
    public void removeBroker(Observer observer) {
        brokers.remove(observer);
    }

    @Override
    public void updateAll(String stockName, double stockPrice) {

        for (Observer broker : brokers) {
            broker.update(stockName, stockPrice);
        }
    }
}
