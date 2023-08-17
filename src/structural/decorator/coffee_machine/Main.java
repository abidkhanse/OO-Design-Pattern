package src.structural.decorator.coffee_machine;

import src.structural.decorator.coffee_machine.coffees.Coffee;
import src.structural.decorator.coffee_machine.coffees.HouseBlend;
import src.structural.decorator.coffee_machine.coffees.Latte;
import src.structural.decorator.coffee_machine.decorators.Mocha;
import src.structural.decorator.coffee_machine.decorators.WithMilk;
import src.structural.decorator.coffee_machine.decorators.WithSugar;

public class Main {

    public static void main(String[] args) {

        Coffee latte = new Latte();
        latte = new WithMilk(latte);
        latte = new WithSugar(latte);

        System.out.println("---------------------------");
        System.out.println("| Item-> " + latte.description());
        System.out.println("| Price-> " + latte.cost());
        System.out.println("---------------------------");

        Coffee houseBlend = new WithSugar( new Mocha(( new HouseBlend())));
        System.out.println("---------------------------");
        System.out.println("| Item-> " + houseBlend.description());
        System.out.println("| Price-> " + houseBlend.cost());
        System.out.println("---------------------------");

    }
}
