package homework.pattern.abstractfactory;

public class App {
    public static void main(String[] args) {
        AbstractFactory busFactory = FactoryGenerator.getFactory("AirportBus");

        AirportBus airportBus1 = busFactory.getAirportBusType("Small");
        airportBus1.printBusType();

        AirportBus airportBus2 = busFactory.getAirportBusType("Big");
        airportBus2.printBusType();

        AbstractFactory personFactory = FactoryGenerator.getFactory("Person");

        Person person1 = personFactory.getPersonType("Worker");
        person1.printPersonType();

        Person person2 = personFactory.getPersonType("Passenger");
        person2.printPersonType();
    }
}
