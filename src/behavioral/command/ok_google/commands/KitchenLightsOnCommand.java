package src.behavioral.command.ok_google.commands;

import src.behavioral.command.ok_google.hardware.KitchenLight;

public class KitchenLightsOnCommand implements Command{

    private KitchenLight light;

    public KitchenLightsOnCommand(KitchenLight kitchenLight) {
        this.light = kitchenLight;
    }

    @Override
    public void execute() {
        light.on();
    }

}
