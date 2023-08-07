package src.behavioral.memento.mem_example;

public class Organizer {

    private String state;

    private void setState(String state) {
        this.state = state;
    }

    private Memento saveStateToMemento() {
        return new Memento(this.state);
    }

    public String getStateFromMemento(Memento memento) {
        return memento.getState();
    }

    public Memento execute(String state) {
        this.setState(state);
        return this.saveStateToMemento();
    }

}
