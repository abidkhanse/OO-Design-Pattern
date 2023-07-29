package src.behavioral.command.remote_control;

public class RemoteControl {

    private Command slot;

    RemoteControl() {}

    public void setCommand(Command slot) {
        this.slot = slot;
    }

    public void buttonPressed() {
        slot.execute();
    }

}
