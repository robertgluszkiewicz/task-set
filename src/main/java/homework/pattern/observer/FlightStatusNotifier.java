package homework.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class FlightStatusNotifier implements FlightStatusSubject {
    private List<FlightStatusObserver> observers;
    private String flightStatus;

    public FlightStatusNotifier() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(FlightStatusObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(FlightStatusObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (FlightStatusObserver observer : observers) {
            observer.update(flightStatus);
        }
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
        notifyObservers();
    }
}

