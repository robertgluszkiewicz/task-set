package homework.pattern.observer;

public class PassengerNotificationSystem implements FlightStatusObserver {
    @Override
    public void update(String flightStatus) {
        System.out.println("Passenger Notification Service alerted: " + flightStatus);
    }
}
