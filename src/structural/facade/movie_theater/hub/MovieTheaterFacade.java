package src.structural.facade.movie_theater.hub;

import src.structural.facade.movie_theater.components.Light;
import src.structural.facade.movie_theater.components.Projector;
import src.structural.facade.movie_theater.components.SoundSystem;

public class MovieTheaterFacade {

    private final Light light;
    private final Projector projector;
    private final SoundSystem soundSystem;

    public MovieTheaterFacade() {

        this.light = new Light();
        this.projector = new Projector();
        this.soundSystem = new SoundSystem(10);

    }

    public void startMovie() {

        System.out.println("-----------Movie Time-----------");
        this.light.on();
        this.projector.on();
        this.soundSystem.on();
        System.out.println("--------------------------------");

    }

    public void endMovie() {

        System.out.println("-----------Movie Ends-----------");

        this.soundSystem.off();
        this.projector.off();
        this.light.off();

        System.out.println("--------------------------------");

    }

    public void increaseVolume(int v) {
        this.soundSystem.setVolume(v);
    }

}
