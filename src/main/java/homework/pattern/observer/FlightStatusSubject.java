package homework.pattern.observer;

public interface FlightStatusSubject {
    void addObserver(FlightStatusObserver observer);
    void removeObserver(FlightStatusObserver observer);
    void notifyObservers();
}

