package src.structural.bridge.animal_walk;

public class Walk implements IMove{
    @Override
    public void move() {
        System.out.println("I'm Moving with legs");
    }
}
