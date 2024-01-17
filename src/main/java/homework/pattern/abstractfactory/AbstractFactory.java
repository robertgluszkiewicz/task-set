package homework.pattern.abstractfactory;

public abstract class AbstractFactory {
    abstract Person getPersonType(String person);
    abstract AirportBus getAirportBusType(String type);
}
