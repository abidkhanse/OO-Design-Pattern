package src.structural.decorator.pizza_machine.pizza_types;

public class Vegipizza implements Pizza{
    @Override
    public String bake() {
        return "Baking Vag Pizza";
    }

    @Override
    public double cost() {
        return 4.5;
    }
}
