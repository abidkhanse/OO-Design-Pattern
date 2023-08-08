package src.behavioral.template.sports;

abstract public class Game {

    public void play() {

        initilize();
        startPlay();
        endPlay();

    }

    protected abstract void endPlay();

    protected abstract void startPlay();

    protected abstract void initilize();

}
