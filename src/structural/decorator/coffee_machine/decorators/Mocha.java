package src.structural.decorator.coffee_machine.decorators;

import src.structural.decorator.coffee_machine.coffees.Coffee;

public class Mocha extends CoffeeDecorator {

    private final Coffee coffee;

    public Mocha(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return this.coffee.cost() + 0.20;
    }

    @Override
    public String description() {
        return this.coffee.description() + ": With Mocha";
    }

}
