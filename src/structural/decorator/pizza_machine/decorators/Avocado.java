package src.structural.decorator.pizza_machine.decorators;

import src.structural.decorator.pizza_machine.pizza_types.Pizza;

public class Avocado extends PizzaDecorator {
    public Avocado(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return pizza.bake() + " + " + getName();
    }

    @Override
    public double cost() {
        return pizza.cost() + .50;
    }

    String getName() {
        return "Avocado";
    }

}
