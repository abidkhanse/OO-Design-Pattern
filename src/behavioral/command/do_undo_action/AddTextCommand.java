package src.behavioral.command.do_undo_action;

public class AddTextCommand implements TextCommand {

    private TextEditor textEditor;
    private String text;

    public AddTextCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.text = text;
    }

    @Override
    public void doCommand() {
        textEditor.addText(text);
    }

    @Override
    public void undoCommand() {
        textEditor.removeText();
    }

}
