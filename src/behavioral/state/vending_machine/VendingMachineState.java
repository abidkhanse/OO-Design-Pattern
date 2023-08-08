package src.behavioral.state.vending_machine;

public interface VendingMachineState {
    void insertMoney(int amount);
    void selectProduct(String item);
    void buyProduct();
}
