package src.behavioral.visitor.insurance;

public interface Visitor {

    void visitBank(Bank bank);
    void visitHospital(Hospital hospital);
    void visitRestaurant(Restaurant restaurant);

}
