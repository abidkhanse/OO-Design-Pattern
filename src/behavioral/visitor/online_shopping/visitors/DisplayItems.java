package src.behavioral.visitor.online_shopping.visitors;

import src.behavioral.visitor.online_shopping.entities.Keyboard;
import src.behavioral.visitor.online_shopping.entities.Monitor;
import src.behavioral.visitor.online_shopping.entities.Mouse;

public class DisplayItems implements Visitor {

    @Override
    public void visit(Keyboard keyboard) {
        System.out.printf("Keyboard name: %s and price: %s%n",keyboard.getName(), keyboard.getPrice() );
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.printf("Mouse name: %s and price: %s%n",mouse.getName(), mouse.getPrice() );
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.printf("Monitor name: %s and price: %s%n",monitor.getName(), monitor.getPrice() );
    }

}
