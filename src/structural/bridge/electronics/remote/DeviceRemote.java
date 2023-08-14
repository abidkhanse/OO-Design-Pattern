package src.structural.bridge.electronics.remote;

import src.structural.bridge.electronics.devices.Device;

public class DeviceRemote implements Remote {

    Device device;

    public DeviceRemote(Device remote) {
        this.device = remote;
    }

    @Override
    public void volumeUp() {
        this.device.volumeUp();
    }

    @Override
    public void volumeDown() {
        this.device.volumeDown();
    }

    @Override
    public void changeChannel(int channel) {
        this.device.setChannel(channel);
    }

    @Override
    public void powerButton() {

        if (this.device.isSwitchedOn()) {
            this.device.switchOff();
        } else {
            this.device.switchOn();
        }
    }

    @Override
    public void getStatus() {
        this.device.printStatus();
    }
}
