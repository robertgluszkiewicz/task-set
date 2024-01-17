package homework.pattern.facade;

public class AirportFacade {
    private FlightManagementSystem flightManagement;
    private SecurityControl securityControl;
    private LuggageHandlingSystem baggageHandling;

    public AirportFacade() {
        flightManagement = new FlightManagementSystem();
        securityControl = new SecurityControl();
        baggageHandling = new LuggageHandlingSystem();
    }

    public void handleDeparture(String flightDetails) {
        System.out.println("Handling departure for flight: " + flightDetails);
        flightManagement.scheduleFlight(flightDetails);
        securityControl.performSecurityCheck();
        baggageHandling.processLuggage();
    }
}

