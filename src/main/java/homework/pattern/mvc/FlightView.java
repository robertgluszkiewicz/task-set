package homework.pattern.mvc;

public class FlightView {
    public void printFlightDetails(Flight flight) {
        System.out.println("Flight: " + flight.getFlightNumber() + ", Destination: " + flight.getDestination());
    }
}

