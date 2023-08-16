package src.structural.decorator.coffee_machine.decorators;

import src.structural.decorator.coffee_machine.coffees.Coffee;

public class WithMilk extends CoffeeDecorator {

    private final Coffee coffee;

    public WithMilk(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public double cost() {
        return this.coffee.cost() + 0.20;
    }

    @Override
    public String description() {
        return this.coffee.description() + ":With Milk";
    }
}
