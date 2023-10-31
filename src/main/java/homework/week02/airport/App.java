package homework.week02.airport;

import java.util.List;

import homework.week02.airport.aircraft.AirAmbulance;
import homework.week02.airport.aircraft.Airbus;
import homework.week02.airport.aircraft.AircraftType;
import homework.week02.airport.flight.CargoFlight;
import homework.week02.airport.flight.FlightType;
import homework.week02.airport.flight.PassengerFlight;
import homework.week02.airport.person.CrewMember;
import homework.week02.airport.person.CrewRole;
import homework.week02.airport.person.Passenger;

public class App {
    public static void main(String[] args) {
        Airbus airbus = new Airbus(
                "Boeing",
                AircraftType.PASSENGER,
                23874,
                31983,
                "777X",
                "Lufthansa");

        List<Passenger> passengers = List.of(
                new Passenger("John", "Back", "DEN", "NYC"),
                new Passenger("May", "Finn", "DEN", "NYC")
        );

        List<CrewMember> crewMembers = List.of(
                new CrewMember("Sara", "Fed", CrewRole.PILOT, "007XYZ"),
                new CrewMember("Tom", "Down", CrewRole.FLIGHT_ATTENDANT, "001QWE")
        );

        PassengerFlight passengerFlight = new PassengerFlight(
                12345,
                FlightType.COMMERCIAL,
                AircraftType.PASSENGER,
                passengers,
                crewMembers,
                "US2832"
        );

        CargoFlight cargoFlight = new CargoFlight(
                56789,
                FlightType.COMMERCIAL,
                AircraftType.CARGO,
                "FedEx"
        );

        System.out.println("AIRCRAFT DATA:");
        System.out.println(airbus);
        System.out.println();

        System.out.println("FLIGHT DATA");
        System.out.println(passengerFlight);
        System.out.println();


        System.out.println("FLIGHT DATA");
        System.out.println(cargoFlight);
        System.out.println();

        System.out.println("Final class: AIR AMBULANCE");
        AirAmbulance airAmbulance = new AirAmbulance();
        AirAmbulance.locateInjuredPerson();
    }
}
