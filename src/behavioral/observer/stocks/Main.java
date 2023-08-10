package src.behavioral.observer.stocks;

public class Main {
    public static void main(String[] args) {

        Broker b1 = new Broker("Alin");
        Broker b2 = new Broker("Bob");

        StockMarket market = new StockMarket();

        market.addBroker(b1);
        market.addBroker(b2);
        market.updateAll("GOG", 100);

        market.removeBroker(b1);
        market.updateAll("AMAZON", 200);

    }
}
