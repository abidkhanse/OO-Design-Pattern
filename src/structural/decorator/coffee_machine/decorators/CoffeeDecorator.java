package src.structural.decorator.coffee_machine.decorators;

import src.structural.decorator.coffee_machine.coffees.Coffee;

public abstract class CoffeeDecorator extends Coffee {

    abstract public String description();

}
