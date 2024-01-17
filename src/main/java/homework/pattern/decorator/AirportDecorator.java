package homework.pattern.decorator;

public abstract class AirportDecorator implements Airport {
    protected Airport decoratedAirport;

    public AirportDecorator(Airport decoratedAirport) {
        this.decoratedAirport = decoratedAirport;
    }

    public String getDescription() {
        return decoratedAirport.getDescription();
    }
}

