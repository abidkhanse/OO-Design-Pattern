package src.behavioral.template.sports;

public class Cricket extends Game{
    @Override
    protected void endPlay() {
        System.out.println("Finished: What a fantastic match");
    }

    @Override
    protected void startPlay() {
        System.out.println("Nail biting cricket match has started");

    }

    @Override
    protected void initilize() {

        System.out.println("Cricket");
        System.out.println("Both teams are in ground");
    }

}
