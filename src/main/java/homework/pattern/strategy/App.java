package homework.pattern.strategy;

public class App {
    public static void main(String[] args) {
        Airport airport = new Airport();

        airport.setStrategy(new PriorityProcessing());
        airport.processPassenger("Alice");

        airport.setStrategy(new StandardProcessing());
        airport.processPassenger("John");

    }
}

