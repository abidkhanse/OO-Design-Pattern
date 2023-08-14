package src.structural.bridge.animal_walk;

public class Main {
    public static void main(String[] args) {

        IMove walk = new Walk();
        Animal human = new Human(walk);
        human.howToMove();

        System.out.println("\n******************\n");

        IMove fly = new Fly();
        Animal bird = new Bird(fly);
        bird.howToMove();

    }
}
