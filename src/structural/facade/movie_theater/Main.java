package src.structural.facade.movie_theater;

import src.structural.facade.movie_theater.hub.MovieTheaterFacade;

public class Main {
    public static void main(String[] args) {

        MovieTheaterFacade movieTheaterFacade = new MovieTheaterFacade();
        movieTheaterFacade.startMovie();
        movieTheaterFacade.increaseVolume(20);
        movieTheaterFacade.endMovie();

    }
}
