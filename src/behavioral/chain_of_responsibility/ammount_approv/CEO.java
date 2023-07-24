package src.behavioral.chain_of_responsibility.ammount_approv;

public class CEO implements IApprover{

    private IApprover approver;

    @Override
    public void setRequest(IApprover approver) {
        this.approver = approver;
    }

    @Override
    public void processRequest(double amount) {

        if (amount < 3000) {
            String message = String.format("%s amount is approved by CEO", amount);
            System.out.println(message);
        } else {
            String message = String.format("%s this amount is out of range... request is declined", amount);
            System.out.println(message);
        }
    }
}
