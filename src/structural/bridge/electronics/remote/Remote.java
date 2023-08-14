package src.structural.bridge.electronics.remote;

public interface Remote {

    void volumeUp();
    void volumeDown();
    void changeChannel(int channel);
    void powerButton();

    void getStatus();

}
