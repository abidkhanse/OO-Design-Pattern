package src.behavioral.command.ok_google.commands;

import src.behavioral.command.ok_google.hardware.KitchenLight;
import src.behavioral.command.ok_google.hardware.MusicSystem;

public class EverythingOnCommand implements Command {

    private final KitchenLight kitchenLight;
    private final MusicSystem musicSystem;

    public EverythingOnCommand(MusicSystem musicSystem, KitchenLight kitchenLight) {
        this.musicSystem = musicSystem;
        this.kitchenLight = kitchenLight;
    }


    @Override
    public void execute() {
        System.out.println("PARTY TIME.....");
        this.musicSystem.on();
        this.musicSystem.setChannel("FM-100");
        this.musicSystem.setVolume(10);
        this.kitchenLight.on();
    }

}
