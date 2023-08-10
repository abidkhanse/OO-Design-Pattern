package src.behavioral.visitor.online_shopping.visitors;

import src.behavioral.visitor.online_shopping.entities.Keyboard;
import src.behavioral.visitor.online_shopping.entities.Monitor;
import src.behavioral.visitor.online_shopping.entities.Mouse;

public class ShoppingCartTotal implements Visitor {

    double amount = 0.0;

    @Override
    public void visit(Keyboard keyboard) {
        System.out.printf("Bought keyboard %s with price: %s%n",keyboard.getName(), keyboard.getPrice() );
        amount+=keyboard.getPrice();
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.printf("Bought mouse %s with price: %s%n",mouse.getName(), mouse.getPrice() );
        amount+=mouse.getPrice();
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.printf("Bought monitor %s with price: %s%n",monitor.getName(), monitor.getPrice() );
        amount+=monitor.getPrice();
    }

    public double getAmount() {
        return amount;
    }
}
