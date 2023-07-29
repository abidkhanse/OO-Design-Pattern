package src.behavioral.command.ok_google.hardware;

public class MusicSystem {

    private String channel;
    private int volume;

    public MusicSystem(String channel, int volume) {
        this.channel = channel;
        this.volume = volume;
    }

    public void on() {
        System.out.println("Music ON");
    }

    public void off() {
        System.out.println("Music OFF");
    }

    public void setChannel(String channel) {
        System.out.printf("%s Channel is set %n", channel);
        this.channel = channel;
    }

    public void setVolume(int volume) {
        System.out.printf("%s level volume is set %n", volume);
        this.volume = volume;
    }

}
