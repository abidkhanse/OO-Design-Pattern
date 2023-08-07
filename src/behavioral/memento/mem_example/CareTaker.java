package src.behavioral.memento.mem_example;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> list = new ArrayList<>();

    public void add(Memento memento) {
        list.add(memento);
    }

    public Memento getMemento(int index) {
        return list.get(index);
    }

}
