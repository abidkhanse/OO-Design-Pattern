package src.behavioral.chain_of_responsibility.ammount_approv;

public class Main {

    public static void main(String[] args) {

        IApprover manager = new Manager();
        IApprover cto = new CTO();
        IApprover ceo = new CEO();

        manager.setRequest(cto);
        cto.setRequest(ceo);
        manager.processRequest(500);
        manager.processRequest(1500);
        manager.processRequest(2500);
        manager.processRequest(3500);
    }
}
