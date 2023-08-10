package src.behavioral.visitor.online_shopping.entities;

import src.behavioral.visitor.online_shopping.visitors.Visitor;

public interface Item {

    String getName();
    double getPrice();

    void accept(Visitor visitor);


}
