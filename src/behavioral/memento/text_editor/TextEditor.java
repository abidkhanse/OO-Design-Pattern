package src.behavioral.memento.text_editor;


// Organizer
public class TextEditor {

    private String text;

    public TextEditor() {
        this.text = "";
    }

    public void write(String text) {
        this.text += text;
    }

    public String getText() {
        return this.text;
    }

    public Memento createMemento(){
        return new Memento(this.text);
    }

    public void restore(Memento memento) {
        this.text = memento != null ? memento.getContent() : "";
    }

}
