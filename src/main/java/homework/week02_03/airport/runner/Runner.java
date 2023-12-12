package homework.week02_03.airport.runner;

import java.util.function.Function;
import java.util.function.Predicate;

import homework.week02_03.airport.enums.AircraftType;
import homework.week02_03.airport.enums.CrewRole;
import homework.week02_03.airport.enums.EmergencyLocatorTransmitter;
import homework.week02_03.airport.enums.FlightMode;
import homework.week02_03.airport.enums.FlightType;
import homework.week02_03.airport.flight.CargoFlight;
import homework.week02_03.airport.flight.Flight;
import homework.week02_03.airport.person.CrewMember;

public class Runner {
    public static void main(String[] args) {

        System.out.println(" - - - Enum examples - - -");

        AircraftType aircraftType = AircraftType.PASSENGER;
        System.out.println("Type: " + aircraftType.getName());
        System.out.println("Code: " + aircraftType.getCode());
        System.out.println();

        CrewRole crewRole = CrewRole.PILOT;
        System.out.println("Role: " + crewRole.getName());
        System.out.println("Code: " + crewRole.getCode());
        System.out.println();

        FlightType flightType = FlightType.COMMERCIAL;
        System.out.println("Type: " + flightType.getName());
        System.out.println("Code: " + flightType.getCode());
        System.out.println();

        FlightMode flightMode = FlightMode.STANDARD;
        System.out.println("Mode: " + flightMode.getName());
        System.out.println("Priority: " + flightMode.isPriority());
        System.out.println();

        EmergencyLocatorTransmitter elt = EmergencyLocatorTransmitter.AUTOMATIC_PORTABLE;
        System.out.println("Name: " + elt.getName());
        System.out.println("Frequency [MHz]: " + elt.getMhzFrequency());
        System.out.println();

        CargoFlight cargoFlight = new CargoFlight(
                1234, FlightType.COMMERCIAL,
                FlightMode.STANDARD,
                AircraftType.CARGO,
                "FedEx");

        CrewMember lauraSottosanti = new CrewMember(
                "Laura",
                "Sottosanti",
                CrewRole.PILOT,
                "321QWE");

        System.out.println(" - - - Lambda functions - - -");

        System.out.println("Example 1");
        Runnable printCargoOwner = () -> System.out.println("Cargo owner: " + cargoFlight.getCargoOwner());
        printCargoOwner.run();
        System.out.println();

        System.out.println("Example 2");
        Runnable printCrewMemberLicenseId = () -> System.out.println("License ID: " + lauraSottosanti.getLicenseId());
        printCrewMemberLicenseId.run();
        System.out.println();

        System.out.println("Example 3");
        Predicate<CrewMember> roleFilter = crewMember -> crewMember.getCrewRole() == CrewRole.PILOT;
        System.out.println("Is he/she a pilot? " + roleFilter.test(lauraSottosanti));
        System.out.println();

        System.out.println("Example 4");
        Predicate<CrewMember> licenseFilter = crewMember -> crewMember.getLicenseId().contains("QWE");
        System.out.println("Does the license ID contains 'QWE'? " + licenseFilter.test(lauraSottosanti));
        System.out.println();

        System.out.println("Example 5");
        Predicate<CrewMember> firstLetterOfLastNameFilter = crewMember -> crewMember.getLastName().startsWith("B");
        System.out.println("Does the last name start with 'B'? " + firstLetterOfLastNameFilter.test(lauraSottosanti));
        System.out.println();

        System.out.println(" - - - Custom lambda functions with generics - - -");

        System.out.println("Example 1");
        Function<Flight, Long> getFlightId = Flight::getId;
        System.out.println("Cargo flight ID: " + getFlightId.apply(cargoFlight));
        System.out.println();

        System.out.println("Example 2");
        Function<CargoFlight, String> getCargoOwner = CargoFlight::getCargoOwner;
        System.out.println("Cargo owner: " + getCargoOwner.apply(cargoFlight));
        System.out.println();

        System.out.println("Example 3");
        Function<CrewMember, String> getCrewMemberLicenseId = CrewMember::getLicenseId;
        System.out.println("License ID: : " + getCrewMemberLicenseId.apply(lauraSottosanti));
        System.out.println();
    }
}
