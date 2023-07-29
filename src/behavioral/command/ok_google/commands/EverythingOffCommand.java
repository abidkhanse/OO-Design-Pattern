package src.behavioral.command.ok_google.commands;

import src.behavioral.command.ok_google.hardware.KitchenLight;
import src.behavioral.command.ok_google.hardware.MusicSystem;

public class EverythingOffCommand implements Command {

    private final KitchenLight kitchenLight;
    private final MusicSystem musicSystem;

    public EverythingOffCommand(MusicSystem musicSystem, KitchenLight kitchenLight) {
        this.musicSystem = musicSystem;
        this.kitchenLight = kitchenLight;
    }

    @Override
    public void execute() {

        System.out.println("\nSWITCHED OFF EVERYTHING");
        this.musicSystem.off();
        this.musicSystem.setChannel("no");
        this.musicSystem.setVolume(0);
        this.kitchenLight.off();

    }

}
