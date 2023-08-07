package src.behavioral.mediator.aircraft_landing;

import java.util.ArrayList;

public class FlightMediator implements IMediator{

    ArrayList<Aircraft> birdsInSky;

    public FlightMediator() {
        this.birdsInSky = new ArrayList<>();
    }

    public void addAirCraft(Aircraft aircraft) {
        birdsInSky.add(aircraft);
    }

    @Override
    public void requestLanding(Aircraft aircraft) {
        System.out.printf("%s aircraft requests landing clearance%n", aircraft.getFlightNumber());
        grantLandingClearance(aircraft);
    }

    @Override
    public void grantLandingClearance(Aircraft aircraft) {

        for (Aircraft eagle : birdsInSky) {
            if (!aircraft.equals(eagle)) {
                eagle.acknowledgeLanding();
            }
        }
    }
}
