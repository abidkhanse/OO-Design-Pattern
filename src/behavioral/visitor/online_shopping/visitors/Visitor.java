package src.behavioral.visitor.online_shopping.visitors;

import src.behavioral.visitor.online_shopping.entities.Keyboard;
import src.behavioral.visitor.online_shopping.entities.Monitor;
import src.behavioral.visitor.online_shopping.entities.Mouse;

public interface Visitor {

    void visit(Keyboard keyboard);
    void visit(Mouse mouse);
    void visit(Monitor monitor);

}
