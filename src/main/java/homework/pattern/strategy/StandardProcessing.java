package homework.pattern.strategy;

public class StandardProcessing implements PassengerProcessingStrategy {
    @Override
    public void processPassenger(String passengerName) {
        System.out.println(passengerName + " - standard procedures");
    }
}
