package src.structural.adapter.duck_turkey;

public class Main {
    public static void main(String[] args) {

        Turkey turkey = new WildTurkey();
        turkey.gobble();
        turkey.fly();
        System.out.println("****************");

        Duck duck = new MallardDuck();
        duck.quack();
        duck.fly();
        System.out.println("****************");

        Duck turkeyDuck = new TurkeyAdapter(turkey);
        turkeyDuck.quack();
        turkeyDuck.fly();

    }
}
