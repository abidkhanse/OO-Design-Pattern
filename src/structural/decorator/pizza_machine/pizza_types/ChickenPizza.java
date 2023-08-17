package src.structural.decorator.pizza_machine.pizza_types;

public class ChickenPizza implements Pizza{
    @Override
    public String bake() {
        return "Baking Chicken Pizza";
    }

    @Override
    public double cost() {
        return 6.0;
    }
}
