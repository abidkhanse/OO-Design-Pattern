package src.structural.bridge.animal_walk;

public class Bird implements Animal{

    IMove iMove;
    public Bird(IMove iMove) {
        this.iMove = iMove;
        System.out.println("I'm bird");
    }

    @Override
    public void howToMove() {
        iMove.move();
    }
}
