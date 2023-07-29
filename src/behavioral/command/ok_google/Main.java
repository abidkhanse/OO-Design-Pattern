package src.behavioral.command.ok_google;

import src.behavioral.command.ok_google.GoogleNest;
import src.behavioral.command.ok_google.commands.*;
import src.behavioral.command.ok_google.hardware.KitchenLight;
import src.behavioral.command.ok_google.hardware.MusicSystem;

public class Main {

    public static void main(String[] args) {
        // Example 1
        GoogleNest googleNest = new GoogleNest(3);
        System.out.println(googleNest);

        // Example 2
        KitchenLight kitchenLight = new KitchenLight("Kitchen Light");

        Command commandOn = new KitchenLightsOnCommand(kitchenLight);
        Command commandOff = new KitchenLightsOffCommand(kitchenLight);

        googleNest.setCommand(0, commandOn, commandOff);
        System.out.println(googleNest);

        googleNest.activateCommand(0);
        googleNest.deActivateCommand(0);

        // Example 3
        MusicSystem musicSystem = new MusicSystem("FM-100", 10);
        Command musicOn = new MusicSystemOnCommand(musicSystem);
        Command musicOff = new MusicSystemOffCommand(musicSystem);

        googleNest.setCommand(1, musicOn, musicOff);
        System.out.println(googleNest);

        googleNest.activateCommand(1);
        googleNest.deActivateCommand(1);


        // Example 4
        Command everyThingOn = new EverythingOnCommand(musicSystem, kitchenLight);
        Command everyThingOff = new EverythingOffCommand(musicSystem, kitchenLight);

        googleNest.setCommand(2,everyThingOn,everyThingOff);
        System.out.println(googleNest);
        googleNest.activateCommand(2);
        googleNest.deActivateCommand(2);


    }
}
