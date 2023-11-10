package homework.week02.airport.flight;

import homework.week02.airport.aircraft.AircraftType;

public abstract class Flight {
    protected long id;
    protected FlightType flightType;
    protected AircraftType aircraftType;

    public Flight(long id, FlightType flightType, AircraftType aircraftType) {
        this.id = id;
        this.flightType = flightType;
        this.aircraftType = aircraftType;
    }

    public long getId() {
        return id;
    }

    public FlightType getFlightType() {
        return flightType;
    }

    public AircraftType getAircraftType() {
        return aircraftType;
    }
}
