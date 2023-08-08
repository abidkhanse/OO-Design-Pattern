package src.behavioral.state.vending_machine;

public class VendingMachine {

    private VendingMachineState currentState;

    public VendingMachine() {
        currentState = new NoMoneyState();
    }

    public void insertMoney(int amount) {

        this.currentState.insertMoney(amount);
        if (currentState instanceof NoMoneyState) {
            this.currentState = new HasMoneyState();
        }
    }

    public void selectItem(String item) {
        this.currentState.selectProduct(item);
        if (this.currentState instanceof HasMoneyState){
            this.currentState = new ItemSelectedState();
        }
    }

    public void buyProduct() {
        this.currentState.buyProduct();
        if (this.currentState instanceof ItemSelectedState) {
            this.currentState = new NoMoneyState();
        }
    }

}
