package src.behavioral.mediator_pattern.aircraft_landing;

public class Main {

    public static void main(String[] args) {

        FlightMediator mediator = new FlightMediator();

        Aircraft aircraft1 = new Aircraft("FL-001", mediator);
        Aircraft aircraft2 = new Aircraft("FL-002", mediator);
        Aircraft aircraft3 = new Aircraft("FL-003", mediator);

        mediator.addAirCraft(aircraft1);
        mediator.addAirCraft(aircraft2);
        mediator.addAirCraft(aircraft3);

        aircraft1.requestLanding();
        aircraft2.requestLanding();

    }
}
