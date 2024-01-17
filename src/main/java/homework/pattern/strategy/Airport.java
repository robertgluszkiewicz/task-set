package homework.pattern.strategy;

public class Airport {
    private PassengerProcessingStrategy strategy;

    public void setStrategy(PassengerProcessingStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPassenger(String passengerName) {
        strategy.processPassenger(passengerName);
    }
}

