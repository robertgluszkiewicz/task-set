package homework.pattern.strategy;

public class PriorityProcessing implements PassengerProcessingStrategy {
    @Override
    public void processPassenger(String passengerName) {
        System.out.println(passengerName + " - priority procedures");
    }
}
