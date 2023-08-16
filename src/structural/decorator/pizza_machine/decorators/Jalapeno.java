package src.structural.decorator.pizza_machine.decorators;

import src.structural.decorator.pizza_machine.pizza_types.Pizza;

public class Jalapeno extends PizzaDecorator {
    public Jalapeno(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return pizza.bake() + " + " + getName();
    }

    String getName() {
        return "jalapeno";
    }

    @Override
    public double cost() {
        return pizza.cost() + .40;
    }
}
