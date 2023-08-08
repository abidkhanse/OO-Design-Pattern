package src.behavioral.state.vending_machine;

public class NoMoneyState implements VendingMachineState{

    @Override
    public void insertMoney(int amount) {
        System.out.println(amount + " dollar(s) inserted in machine.");
    }

    @Override
    public void selectProduct(String item) {
        System.out.println("First insert money before selecting " + item);
    }

    @Override
    public void buyProduct() {
        System.out.println("First insert money and select the item before buying product.");
    }

}
