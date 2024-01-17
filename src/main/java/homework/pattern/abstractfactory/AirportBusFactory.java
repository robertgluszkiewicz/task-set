package homework.pattern.abstractfactory;

public class AirportBusFactory extends AbstractFactory {
    @Override
    AirportBus getAirportBusType(String type) {
        if (type.equalsIgnoreCase("Small")){
            return new SmallAirportBus();

        } else if(type.equalsIgnoreCase("Big")){
            return new BigAirportBus();
        }
        return null;
    }

    @Override
    Person getPersonType(String person) {
        return null;
    }
}
