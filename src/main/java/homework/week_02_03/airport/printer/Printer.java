package homework.week_02_03.airport.printer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import homework.week_02_03.airport.aircraft.Aircraft;
import homework.week_02_03.airport.aircraft.Position;
import homework.week_02_03.airport.exceptions.AircraftNotFoundException;
import homework.week_02_03.airport.exceptions.CrewMembersNotFoundException;
import homework.week_02_03.airport.exceptions.FlightNotFoundException;
import homework.week_02_03.airport.exceptions.PassengersNotFoundException;
import homework.week_02_03.airport.flight.Flight;
import homework.week_02_03.airport.person.CrewMember;
import homework.week_02_03.airport.person.Passenger;

public class Printer {
    private static final Logger LOGGER = LogManager.getLogger(Printer.class);

    public void printPassengerList(List<Passenger> passengers) {
        try {
            if (passengers == null) {
                throw new PassengersNotFoundException("Passenger list not found");
            }
            for (int i = 0; i < passengers.size(); i++) {
                System.out.println(passengers.get(i));
                LOGGER.info("This is the " + (i + 1) + " passenger on the list");
            }
        } catch (PassengersNotFoundException e) {
            LOGGER.error("Source data error: " + e.getMessage());
        }
    }

    public void printCrewMemberList(List<CrewMember> crewMembers) {
        try {
            if (crewMembers == null) {
                throw new CrewMembersNotFoundException("Crew member list not found");
            }
            crewMembers.forEach(System.out::println);
            if (crewMembers.isEmpty()) {
                LOGGER.warn("Crew member list is empty");
            }
        } catch (CrewMembersNotFoundException e) {
            LOGGER.error("Source data error: " + e.getMessage());
        }
    }

    public void printAircraftInfo(Aircraft aircraft) {
        try {
            if (aircraft == null) {
                throw new AircraftNotFoundException("Aircraft not found");
            }
            System.out.println(aircraft);
        } catch (AircraftNotFoundException e) {
            LOGGER.error("Source data error: " + e.getMessage());
        }
    }

    public void printFlightInfo(Flight flight) {
        try {
            if (flight == null) {
                throw new FlightNotFoundException("Flight not found");
            }
            System.out.println(flight);
        } catch (FlightNotFoundException e) {
            LOGGER.error("Source data error: " + e.getMessage());
        }
    }

    public void printPositionInfoToFile(Position position){
        try (FileWriter fileWriter = new FileWriter("positions.txt")) {
            fileWriter.write(position.toString());
        } catch (IOException e) {
            LOGGER.error("Error writing to the file: " + e.getMessage());
        }
    }
}
