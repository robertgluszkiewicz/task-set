package homework.pattern.decorator;

public class InternationalAirportDecorator extends AirportDecorator {
    public InternationalAirportDecorator(Airport decoratedAirport) {
        super(decoratedAirport);
    }

    @Override
    public String getDescription() {
        return decoratedAirport.getDescription() + ", with international flights";
    }
}

