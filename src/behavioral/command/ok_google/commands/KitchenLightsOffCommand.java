package src.behavioral.command.ok_google.commands;

import src.behavioral.command.ok_google.hardware.KitchenLight;

public class KitchenLightsOffCommand implements Command{

    private KitchenLight light;

    public KitchenLightsOffCommand(KitchenLight kitchenLight) {
        this.light = kitchenLight;
    }

    @Override
    public void execute() {
        light.off();
    }

}
