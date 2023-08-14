package src.structural.bridge.animal_walk;

public class Human implements Animal{

    IMove iMove;
    public Human(IMove iMove) {
        this.iMove = iMove;
        System.out.println("I'm human");
    }

    @Override
    public void howToMove() {
        iMove.move();
    }
}
