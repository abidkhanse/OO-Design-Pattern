package src.behavioral.mediator_pattern.aircraft_landing;

public interface IMediator {

    void requestLanding(Aircraft aircraft);
    void grantLandingClearance(Aircraft aircraft);

}
