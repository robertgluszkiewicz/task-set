package homework.week02_03.airport.flight;

import homework.week02_03.airport.enums.AircraftType;
import homework.week02_03.airport.enums.FlightMode;
import homework.week02_03.airport.enums.FlightType;

public abstract class Flight {
    protected long id;
    protected FlightType flightType;
    protected FlightMode flightMode;
    protected AircraftType aircraftType;


    public Flight(long id, FlightType flightType, FlightMode flightMode, AircraftType aircraftType) {
        this.id = id;
        this.flightType = flightType;
        this.flightMode = flightMode;
        this.aircraftType = aircraftType;
    }

    public long getId() {
        return id;
    }

    public FlightType getFlightType() {
        return flightType;
    }

    public FlightMode getFlightMode() {
        return flightMode;
    }

    public AircraftType getAircraftType() {
        return aircraftType;
    }

    public void setFlightMode(FlightMode flightMode) {
        this.flightMode = flightMode;
    }
}
