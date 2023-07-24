package src.behavioral.strategy.payment;

public class CreditCard implements IPaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println(amount +  " paid by Credit Card");
    }

}
