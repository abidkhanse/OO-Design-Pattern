package strategy.payment;

public class Main {

    public static void main(String[] args) {

        IPaymentStrategy paymentStrategy = new CreditCard();
        paymentStrategy.processPayment(1000);

        paymentStrategy = new PayPal();
        paymentStrategy.processPayment(2000);

        paymentStrategy = new Crypto();
        paymentStrategy.processPayment(3000);

    }
}
