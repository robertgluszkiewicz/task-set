package homework.week_02_03.airport.flight;

import java.util.List;

import homework.week_02_03.airport.aircraft.AircraftType;
import homework.week_02_03.airport.person.CrewMember;
import homework.week_02_03.airport.person.Passenger;

public class PassengerFlight extends Flight {
    private List<Passenger> passengers;
    private List<CrewMember> crewMembers;
    private String flightNumber;

    public PassengerFlight(long id,
                           FlightType flightType,
                           AircraftType aircraftType,
                           List<Passenger> passengers,
                           List<CrewMember> crewMembers,
                           String flightNumber) {
        super(id, flightType, aircraftType);
        this.passengers = passengers;
        this.crewMembers = crewMembers;
        this.flightNumber = flightNumber;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public List<CrewMember> getCrewMembers() {
        return crewMembers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PassengerFlight that = (PassengerFlight) o;

        if (!passengers.equals(that.passengers)) return false;
        if (!crewMembers.equals(that.crewMembers)) return false;
        return flightNumber.equals(that.flightNumber);
    }

    @Override
    public int hashCode() {
        int result = passengers.hashCode();
        result = 31 * result + crewMembers.hashCode();
        result = 31 * result + flightNumber.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ID: " + id + '\n' +
                "number: " + flightNumber + '\n' +
                "type: " + flightType + '\n' +
                "aircraft type: " + aircraftType + '\n' +
                "crew: " + crewMembers + '\n' +
                "passengers: " + passengers + '\n';
    }
}
