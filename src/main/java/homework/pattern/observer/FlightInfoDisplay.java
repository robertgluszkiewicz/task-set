package homework.pattern.observer;

public class FlightInfoDisplay implements FlightStatusObserver {
    @Override
    public void update(String flightStatus) {
        System.out.println("Flight info updated: " + flightStatus);
    }
}
