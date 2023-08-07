package src.behavioral.memento.text_editor;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class History {

    private Stack<Memento> stack = new Stack<>();

    public void addMemento(Memento memento){
        stack.push(memento);
    }

    public Memento getMemento() {

        if (!stack.isEmpty()) {
            stack.pop();
        }

        return !stack.isEmpty() ? stack.peek() : null;

    }


}
