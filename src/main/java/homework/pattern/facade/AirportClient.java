package homework.pattern.facade;

public class AirportClient {
    public static void main(String[] args) {
        AirportFacade airportFacade = new AirportFacade();
        airportFacade.handleDeparture("Flight 12345 to Detroit");
    }
}
