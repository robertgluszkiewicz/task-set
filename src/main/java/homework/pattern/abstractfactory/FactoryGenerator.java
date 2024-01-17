package homework.pattern.abstractfactory;

public class FactoryGenerator {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("AirportBus")) {
            return new AirportBusFactory();
        } else if (choice.equalsIgnoreCase("Person")) {
            return new PersonFactory();
        }
        return null;
    }
}
