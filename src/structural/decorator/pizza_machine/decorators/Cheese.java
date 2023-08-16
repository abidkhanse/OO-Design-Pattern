package src.structural.decorator.pizza_machine.decorators;

import src.structural.decorator.pizza_machine.pizza_types.Pizza;

public class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return pizza.bake() + " + " + getName();
    }

    String getName() {
        return "Cheese";
    }

    @Override
    public double cost() {
        return pizza.cost() + .25;
    }

}
