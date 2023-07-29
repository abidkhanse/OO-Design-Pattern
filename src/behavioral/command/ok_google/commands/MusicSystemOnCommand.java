package src.behavioral.command.ok_google.commands;

import src.behavioral.command.ok_google.hardware.MusicSystem;

public class MusicSystemOnCommand implements Command {

    private final MusicSystem musicSystem;

    public MusicSystemOnCommand(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }

    @Override
    public void execute() {

        this.musicSystem.on();
        this.musicSystem.setVolume(10);
        this.musicSystem.setChannel("FM-100");

    }
}
