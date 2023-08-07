package src.behavioral.memento.text_editor;

public class Main {

    public static void print(String s) {
        System.out.println("[" + s + "]");
    }

    public static void main(String[] args) {

        History history = new History();

        TextEditor textEditor = new TextEditor();

        textEditor.write("Hello, ");
        history.addMemento(textEditor.createMemento());
        print(textEditor.getText());

        textEditor.write("World");
        history.addMemento(textEditor.createMemento());
        print(textEditor.getText());

        textEditor.restore(history.getMemento());
        print(textEditor.getText());

        textEditor.restore(history.getMemento());
        print(textEditor.getText());

        textEditor.write("Again Hello,");
        history.addMemento(textEditor.createMemento());
        print(textEditor.getText());


    }
}
