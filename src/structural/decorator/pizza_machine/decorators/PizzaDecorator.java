package src.structural.decorator.pizza_machine.decorators;

import src.structural.decorator.pizza_machine.pizza_types.Pizza;

public abstract class PizzaDecorator implements Pizza {

    final Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String bake() {
        return this.pizza.bake();
    }

}
