package homework.pattern.mvc;

public class FlightController {
    private Flight model;
    private FlightView view;

    public FlightController(Flight model, FlightView view) {
        this.model = model;
        this.view = view;
    }

    public void setFlightNumber(String flightNumber) {
        model = new Flight(flightNumber, model.getDestination());
    }

    public void setDestination(String destination) {
        model = new Flight(model.getFlightNumber(), destination);
    }

    public void updateView() {
        view.printFlightDetails(model);
    }
}

