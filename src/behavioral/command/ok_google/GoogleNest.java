package src.behavioral.command.ok_google;

import src.behavioral.command.ok_google.commands.Command;
import src.behavioral.command.ok_google.commands.NotImplementedCommand;

public class GoogleNest {

    private Command[] onCommands;
    private Command[] offCommands;
    private int slots;

    GoogleNest(int slots) {

        onCommands = new Command[slots];
        offCommands = new Command[slots];
        this.slots = slots;

        for (int i = 0; i < slots; i++) {
            onCommands[i] = new NotImplementedCommand();
            offCommands[i] = new NotImplementedCommand();
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand ) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void activateCommand(int slot) {
        onCommands[slot].execute();
    }

    public void deActivateCommand(int slot) {
        offCommands[slot].execute();
    }


    @Override
    public String toString(){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nGoogle Nest Device Controller \n");

        for (int i = 0; i < slots; i++) {
            stringBuilder.append("Slot #" + (i + 1) + " - " + onCommands[i].getClass().getSimpleName() + "(" + onCommands.getClass().getSimpleName() + ")" +
                    " - " + offCommands[i].getClass().getSimpleName() + "(" + offCommands.getClass().getSimpleName() + ")" +
                    "\n");
        }
        return stringBuilder.toString();

    }

}
