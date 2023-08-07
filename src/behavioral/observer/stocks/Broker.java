package src.behavioral.observer.stocks;

public class Broker implements Observer{

    private String brokerName;

    public Broker(String name) {
        this.brokerName = name;
    }

    @Override
    public void update(String stockName, double stockPrice) {

        System.out.println("\nStock update for: Mr." + this.brokerName);
        System.out.println("Stocks: " + stockName + " Price: " + stockPrice);

    }

}
