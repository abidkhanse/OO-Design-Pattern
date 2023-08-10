package src.behavioral.visitor.online_shopping.entities;

import src.behavioral.visitor.online_shopping.visitors.Visitor;

public class Mouse implements Item {

    private final String name;
    private final double price;

    public Mouse(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
