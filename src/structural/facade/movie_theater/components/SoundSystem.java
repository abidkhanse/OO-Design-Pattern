package src.structural.facade.movie_theater.components;

public class SoundSystem {

    int volume;

    public SoundSystem(int volume) {
        this.volume = volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume set to " + this.volume);
    }

    public void on() {
        System.out.println("Sound is ON");
    }

    public void off() {
        System.out.println("Sound is OFF");
    }
}
