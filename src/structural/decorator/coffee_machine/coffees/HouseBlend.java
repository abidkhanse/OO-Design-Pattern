package src.structural.decorator.coffee_machine.coffees;

public class HouseBlend extends Coffee{
    @Override
    public double cost() {
        return 1.0;
    }

    @Override
    public String description() {
        return "House blended coffee";
    }

}
