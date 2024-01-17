package homework.pattern.observer;

public class Airport {
    public static void main(String[] args) {
        FlightStatusNotifier notifier = new FlightStatusNotifier();

        FlightInfoDisplay infoDisplay = new FlightInfoDisplay();
        PassengerNotificationSystem notificationService = new PassengerNotificationSystem();

        notifier.addObserver(infoDisplay);
        notifier.addObserver(notificationService);

        notifier.setFlightStatus("Flight 12345 delayed by 50 minutes");

        notifier.removeObserver(infoDisplay);
        notifier.setFlightStatus("Flight 54321 is now boarding");
    }
}
