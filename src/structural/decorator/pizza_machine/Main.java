package src.structural.decorator.pizza_machine;

import src.structural.decorator.pizza_machine.decorators.*;
import src.structural.decorator.pizza_machine.pizza_types.ChickenPizza;
import src.structural.decorator.pizza_machine.pizza_types.Pizza;
import src.structural.decorator.pizza_machine.pizza_types.Vegipizza;

public class Main {

    public static void main(String[] args) {

        Pizza chicken = new ChickenPizza();
        chicken = new Cheese(chicken);
        chicken = new Pickle(chicken);

        System.out.println("---------------------------");
        System.out.println("| Item-> " + chicken.bake());
        System.out.println("| Price-> " + chicken.cost());
        System.out.println("---------------------------");

        Pizza veg = new Vegipizza();
        veg = new Cheese(veg);
        veg = new Avocado(veg);
        veg = new Jalapeno(veg);
        veg = new Pineapple(veg);

        System.out.println("---------------------------");
        System.out.println("| Item-> " + veg.bake());
        System.out.println("| Price-> " + veg.cost());
        System.out.println("---------------------------");

    }
}
