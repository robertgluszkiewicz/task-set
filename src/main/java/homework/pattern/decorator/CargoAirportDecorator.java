package homework.pattern.decorator;

public class CargoAirportDecorator extends AirportDecorator {
    public CargoAirportDecorator(Airport decoratedAirport) {
        super(decoratedAirport);
    }

    @Override
    public String getDescription() {
        return decoratedAirport.getDescription() + ", handling cargo operations";
    }
}
