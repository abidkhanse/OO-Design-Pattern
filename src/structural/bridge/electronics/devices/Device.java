package src.structural.bridge.electronics.devices;

public interface Device {

    void switchOn();
    void switchOff();
    void volumeUp();
    void volumeDown();
    void setChannel(int channel);
    boolean isSwitchedOn();
    void printStatus();

}
