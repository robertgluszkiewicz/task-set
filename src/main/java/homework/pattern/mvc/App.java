package homework.pattern.mvc;

public class App {
    public static void main(String[] args) {
        Flight model = new Flight("12345", "New York");
        FlightView view = new FlightView();
        FlightController flightController = new FlightController(model, view);

        flightController.updateView();

        flightController.setDestination("Alabama");
        flightController.updateView();
    }
}

