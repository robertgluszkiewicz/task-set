package homework.pattern.abstractfactory;

public class PersonFactory extends AbstractFactory {
    @Override
    AirportBus getAirportBusType(String type) {
        return null;
    }

    @Override
    Person getPersonType(String person) {
        if(person.equalsIgnoreCase("Worker")){
            return new Passenger();

        }else if(person.equalsIgnoreCase("Passenger")){
            return new Worker();
        }
        return null;
    }
}
