package src.structural.bridge.animal_walk;

public class Fly implements IMove{
    @Override
    public void move() {
        System.out.println("I'm Flapping with wings");
    }
}
