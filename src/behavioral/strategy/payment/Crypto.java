package src.behavioral.strategy.payment;

public class Crypto implements IPaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println(amount + " paid by Crypto Currency");
    }
}
