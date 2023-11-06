package homework.week_02_03.airport.flight;

import homework.week_02_03.airport.aircraft.AircraftType;

public abstract class Flight {
    protected long id;
    protected FlightType flightType;
    protected AircraftType aircraftType;

    public Flight(long id, FlightType flightType, AircraftType aircraftType) {
        this.id = id;
        this.flightType = flightType;
        this.aircraftType = aircraftType;
    }
}
