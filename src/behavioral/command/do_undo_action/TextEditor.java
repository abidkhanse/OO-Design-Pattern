package src.behavioral.command.do_undo_action;

import java.util.Stack;

public class TextEditor {
    StringBuilder stringBuilder;
    Stack<TextCommand> stack;

    public TextEditor() {
        this.stringBuilder = new StringBuilder();
        this.stack = new Stack<>();
    }

    public void addText(String text) {
        stringBuilder.append(text);
        System.out.println("Added text: " + text);
    }

    public void removeText() {

    }

}
