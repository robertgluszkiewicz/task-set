package homework.week02_03.airport.printer;

import java.util.Collections;
import java.util.List;

import homework.week02_03.airport.aircraft.Position;
import homework.week02_03.airport.person.Passenger;

public class Processor {
    static {
        System.setProperty("log4j2.configurationFile", "log4j2.xml");
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        List<Passenger> passengers = List.of(
                new Passenger("John", "Back", "DEN", "NYC"),
                new Passenger("May", "Finn", "DEN", "NYC"),
                new Passenger("Alice", "March", "DEN", "NYC")
        );

        Position position = new Position(54.22, 18.31);

        printer.printPassengerList(passengers);
        printer.printCrewMemberList(Collections.emptyList());
        printer.printAircraftInfo(null);
        printer.printFlightInfo(null);
        printer.printPositionInfoToFile(position);
    }
}
