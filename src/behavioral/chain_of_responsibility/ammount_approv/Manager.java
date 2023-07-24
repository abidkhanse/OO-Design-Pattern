package src.behavioral.chain_of_responsibility.ammount_approv;

public class Manager implements IApprover {

    private IApprover approver = null;

    @Override
    public void setRequest(IApprover approver) {
        this.approver = approver;
    }

    @Override
    public void processRequest(double amount) {

        if (amount <1000) {
            String message = String.format("%s amount is approved by manager", amount);
            System.out.println(message);
        } else if (approver != null) {
            approver.processRequest(amount);
        }

    }
}
