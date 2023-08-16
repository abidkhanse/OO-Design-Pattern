package src.structural.decorator.coffee_machine.coffees;

public class Latte extends Coffee{
    @Override
    public double cost() {
        return 1.5;
    }

    @Override
    public String description() {
        return getClass().getSimpleName();
    }
}
