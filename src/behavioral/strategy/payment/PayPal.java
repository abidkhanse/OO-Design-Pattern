package src.behavioral.strategy.payment;

public class PayPal implements IPaymentStrategy {

    @Override
    public void processPayment(double amount) {
        System.out.println(amount + " paid by PayPal");
    }

}
