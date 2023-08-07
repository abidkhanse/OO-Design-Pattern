package src.behavioral.mediator.aircraft_landing;

public interface IMediator {

    void requestLanding(Aircraft aircraft);
    void grantLandingClearance(Aircraft aircraft);

}
