package src.behavioral.state.vending_machine;


public class Main {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertMoney(10);
        vendingMachine.selectItem("Butter Candy Box");
        vendingMachine.buyProduct();

    }
}
