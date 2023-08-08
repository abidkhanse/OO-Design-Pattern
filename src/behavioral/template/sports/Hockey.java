package src.behavioral.template.sports;

public class Hockey extends Game{
    @Override
    protected void endPlay() {
        System.out.println("Finished: match is completed");
    }

    @Override
    protected void startPlay() {
        System.out.println("hockey match has started");
    }

    @Override
    protected void initilize() {
        System.out.println("Hockey");
        System.out.println("Both teams are in ground");
    }

}
