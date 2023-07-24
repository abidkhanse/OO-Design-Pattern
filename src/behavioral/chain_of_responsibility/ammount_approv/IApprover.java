package src.behavioral.chain_of_responsibility.ammount_approv;

public interface IApprover {

    void setRequest(IApprover approver);
    void processRequest(double amount);

}

