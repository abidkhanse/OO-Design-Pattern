package src.behavioral.visitor.insurance;

public class Main {
    public static void main(String[] args) {

        Visitor visitor = new InsuranceMessagingVisitor();

        Bank bank = new Bank("SEB");
        Hospital hospital = new Hospital("National Hospital");
        Restaurant restaurant = new Restaurant("PC");

        bank.accept(visitor);
        hospital.accept(visitor);
        restaurant.accept(visitor);

    }
}
