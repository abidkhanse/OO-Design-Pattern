package src.structural.decorator.pizza_machine.decorators;

import src.structural.decorator.pizza_machine.pizza_types.Pizza;

public class Pineapple extends PizzaDecorator {
    public Pineapple(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return pizza.bake() + " + " + getName();
    }

    String getName() {
        return "Pineapple";
    }

    @Override
    public double cost() {
        return pizza.cost() + 1.0;
    }

}
