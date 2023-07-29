package src.behavioral.command.ok_google.commands;

import src.behavioral.command.ok_google.hardware.MusicSystem;

public class MusicSystemOffCommand implements Command {

    private final MusicSystem musicSystem;

    public MusicSystemOffCommand(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }

    @Override
    public void execute() {
        this.musicSystem.off();
    }

}
