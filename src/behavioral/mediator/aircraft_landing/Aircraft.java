package src.behavioral.mediator.aircraft_landing;

public class Aircraft{
    private String aircraftNumber;

    private IMediator mediator;

    public Aircraft(String aircraftNumber, IMediator mediator) {
        this.aircraftNumber = aircraftNumber;
        this.mediator = mediator;
    }

    public void requestLanding() {
        mediator.requestLanding(this);
    }

    public void acknowledgeLanding() {
        System.out.printf("%s aircraft acknowledges landing clearance%n", getFlightNumber());
    }

    public String getFlightNumber() {
        return this.aircraftNumber;
    }

}
