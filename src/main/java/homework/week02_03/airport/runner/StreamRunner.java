package homework.week02_03.airport.runner;

import java.util.List;

import homework.week02_03.airport.aircraft.AircraftType;
import homework.week02_03.airport.exceptions.PassengersNotFoundException;
import homework.week02_03.airport.flight.FlightType;
import homework.week02_03.airport.flight.PassengerFlight;
import homework.week02_03.airport.person.CrewMember;
import homework.week02_03.airport.person.CrewRole;
import homework.week02_03.airport.person.Passenger;

public class StreamRunner {
    public static void main(String[] args) throws PassengersNotFoundException {
        List<Passenger> passengers = List.of(
                new Passenger("John", "Kilian", "DEN", "NYC"),
                new Passenger("Bruce", "Clark", "DEN", "NYC"),
                new Passenger("Emma", "Fox", "DEN", "NYC"),
                new Passenger("Freya", "Ghost", "DEN", "NYC"),
                new Passenger("Gregory", "Hyde", "DEN", "NYC"),
                new Passenger("Hilary", "Denver", "DEN", "NYC"),
                new Passenger("Charles", "Dirk", "DEN", "NYC"),
                new Passenger("Alice", "Brown", "DEN", "NYC"),
                new Passenger("Ciara", "Eisenberg", "DEN", "NYC"),
                new Passenger("Isabell", "Jameson", "DEN", "NYC")
        );

        List<CrewMember> crewMembers = List.of(
                new CrewMember("Giulia", "Gallo", CrewRole.PILOT, "007XYZ"),
                new CrewMember("Marco", "Capone", CrewRole.PILOT, "022QWE"),
                new CrewMember("Aurora", "Bianchi", CrewRole.FLIGHT_ATTENDANT, "023GFD"),
                new CrewMember("Stella", "Rizzo", CrewRole.FLIGHT_ATTENDANT, "043GCD"),
                new CrewMember("Angela", "Esposito", CrewRole.FLIGHT_ATTENDANT, "094KLE")
        );
        PassengerFlight passengerFlight = new PassengerFlight(
                1234,
                FlightType.COMMERCIAL,
                AircraftType.PASSENGER,
                passengers,
                crewMembers,
                "NF30510"
        );

        System.out.println(" - - - Stream examples - - -");

        System.out.println("Example 1");
        System.out.println("Number of passengers on flight to 'NYC': " + passengerFlight.getPassengersNumberOnFlightToAGivenAirport("NYC"));
        System.out.println();

        System.out.println("Example 2");
        System.out.println("Passenger list sorted by last name:");
        passengerFlight.getPassengersSortedByLastName().forEach(System.out::println);
        System.out.println();

        System.out.println("Example 3");
        System.out.println("Passengers whose last name starts with a given letter (D):");
        passengerFlight.getPassengersWhoseLastNameStartsWithAGivenLetter("D").forEach(System.out::println);
        System.out.println();

        System.out.println("Example 4");
        System.out.println("Crew members who have a given role (PILOT):");
        passengerFlight.getCrewMembersWhoHaveAGivenRole(CrewRole.PILOT).forEach(System.out::println);
        System.out.println();

        System.out.println("Example 5");
        System.out.println("License IDs of all crew members:");
        System.out.println(passengerFlight.getCrewMembersLicenseIds());
        System.out.println();

        System.out.println("Example 6");
        System.out.println("Full names of all persons on board:");
        passengerFlight.getFullNamesOfAllPersonsOnBoard(List.of(crewMembers, passengers)).forEach(System.out::println);
        System.out.println();

        System.out.println("Example 7");
        System.out.println("First names with hidden last names for a given person list (crew members):");
        passengerFlight.getFirstNamesWithHiddenLastNames(crewMembers).forEach(System.out::println);
        System.out.println();
    }
}
