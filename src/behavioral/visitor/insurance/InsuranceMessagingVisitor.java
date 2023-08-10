package src.behavioral.visitor.insurance;

public class InsuranceMessagingVisitor implements Visitor {

    @Override
    public void visitBank(Bank bank) {
        System.out.println("Sending monthly income email to Bank " + bank.getName());
    }

    @Override
    public void visitHospital(Hospital hospital) {
        System.out.println("Sending cancer treatment invoice to hospital " + hospital.getName());
    }

    @Override
    public void visitRestaurant(Restaurant restaurant) {
        System.out.println("Sending insurance invoice to restaurant " + restaurant.getName());
    }

}
