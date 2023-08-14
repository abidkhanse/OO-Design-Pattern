package src.structural.bridge.electronics;

import src.structural.bridge.electronics.devices.Device;
import src.structural.bridge.electronics.devices.Radio;
import src.structural.bridge.electronics.devices.TV;
import src.structural.bridge.electronics.remote.DeviceRemote;
import src.structural.bridge.electronics.remote.Remote;

public class Main {
    public static void main(String[] args) {

        Device tv = new TV();
        Device radio = new Radio();

        Remote tvRemote = new DeviceRemote(tv);
        tvRemote.volumeUp();
        tvRemote.volumeUp();
        tvRemote.changeChannel(5);

        tvRemote.getStatus();
        tvRemote.powerButton();
        tvRemote.getStatus();

        Remote radioRemote = new DeviceRemote(radio);
        radioRemote.volumeUp();
        radioRemote.volumeUp();
        radioRemote.volumeUp();
        radioRemote.volumeUp();
        radioRemote.volumeUp();
        radioRemote.volumeUp();
        radioRemote.volumeUp();
        radioRemote.volumeUp();
        radioRemote.getStatus();

        radioRemote.volumeUp();
        radioRemote.volumeUp();
        radioRemote.volumeUp();
        radioRemote.changeChannel(15);

        radioRemote.powerButton();
        radioRemote.getStatus();


    }

}
