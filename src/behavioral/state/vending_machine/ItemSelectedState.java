package src.behavioral.state.vending_machine;

public class ItemSelectedState implements VendingMachineState{

    @Override
    public void insertMoney(int amount) {
        System.out.println(amount + " dollar(s) already selected inserted.");
    }

    @Override
    public void selectProduct(String item) {
        System.out.println(item + " is selected, press buy to get it");
    }

    @Override
    public void buyProduct() {
        System.out.println("Enjoy your stuff");
    }

}
