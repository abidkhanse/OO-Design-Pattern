package src.structural.decorator.pizza_machine.decorators;

import src.structural.decorator.pizza_machine.pizza_types.Pizza;

public class Pickle extends PizzaDecorator {
    public Pickle(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return pizza.bake() + " + " + getName();
    }

    String getName() {
        return "Pickle";
    }

    @Override
    public double cost() {
        return pizza.cost() + .20;
    }

}
