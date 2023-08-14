package src.structural.bridge.electronics.devices;

public class Radio implements Device {

    private int channel;
    private int volume;
    boolean switchedOn;


    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public Radio() {
        this.channel = 1;
        volume = 10;
        this.switchedOn = true;
    }

    @Override
    public void switchOn() {
        if (!switchedOn) {
            switchedOn = true;
        }
    }

    @Override
    public void switchOff() {
        if (switchedOn) {
            switchedOn = false;
        }
    }

    @Override
    public void volumeUp() {
        this.volume += 10;
        if (this.volume > 100) {
            this.volume = 100;
        }
    }

    @Override
    public void volumeDown() {
        this.volume -= 10;
        if (this.volume < 0) {
            this.volume = 0;
        }
    }



    @Override
    public void printStatus() {

        System.out.println("------------------------------------");
        System.out.println("| I'm " + getClass().getSimpleName());
        System.out.println("| I'm " + (switchedOn ? "On" : "Off"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");

    }




}
