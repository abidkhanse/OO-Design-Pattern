package src.behavioral.command.remote_control;

public class Main {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light bedRoom = new Light("Bed room");
        LightOnCommand lightOnCommand = new LightOnCommand(bedRoom);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonPressed();

        LightOffCommand lightOffCommand = new LightOffCommand(bedRoom);
        remoteControl.setCommand(lightOffCommand);
        remoteControl.buttonPressed();



    }

}
