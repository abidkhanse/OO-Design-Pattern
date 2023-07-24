package src.behavioral.chain_of_responsibility.ammount_approv;

public class CTO implements IApprover{
    private IApprover approver;

    @Override
    public void setRequest(IApprover approver) {
        this.approver = approver;
    }

    @Override
    public void processRequest(double amount) {

        if (amount <= 2000) {
            String message = String.format("%s amount is approved by CTO", amount);
            System.out.println(message);
        } else if (approver != null) {
            approver.processRequest(amount);
        }

    }
}
