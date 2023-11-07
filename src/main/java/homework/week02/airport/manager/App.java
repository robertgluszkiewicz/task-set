package homework.week02.airport.manager;

import static homework.week02.airport.manager.Checkin.checkThePassenger;
import static homework.week02.airport.manager.Checkin.setQueueOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import homework.week02.airport.aircraft.Position;
import homework.week02.airport.person.CrewMember;
import homework.week02.airport.person.CrewRole;
import homework.week02.airport.person.Passenger;
import homework.week02.airport.person.Person;

public class App {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        Person johnSmith = new Passenger("John", "Smith", "NYC", "DET");
        Person aliceWhite = new CrewMember("Alice", "White", CrewRole.PILOT, "123QWE");
        Person jamesMay = new Passenger("James", "May", "NYC", "DET");
        Person melodyFork = new Passenger("Melody", "Fork", "NYC", "DET");
        Person bruceMali = new CrewMember("Bruce", "Mali", CrewRole.FLIGHT_ATTENDANT, "456ASD");
        Person miaFlinn = new Passenger("Mia", "Flinn", "NYC", "DET");

        persons.add(johnSmith);
        persons.add(aliceWhite);
        persons.add(jamesMay);
        persons.add(melodyFork);
        persons.add(bruceMali);
        persons.add(miaFlinn);

        Map<Person, Set<String>> luggage = new HashMap<>();
        luggage.put(johnSmith, Set.of("Suitcase", "Guitar"));
        luggage.put(miaFlinn, Set.of("Metal case", "Stroller", "Mannequin"));

        checkThePassenger(setQueueOrder(persons));
        Luggage.printLuggage(luggage);

        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add("1234");
        customLinkedList.add(11.9876);
        customLinkedList.add(true);
        customLinkedList.add(new Position(55.55, 20.20));
        customLinkedList.add(new CrewMember("Laura", "Sottosanti", CrewRole.PILOT, "PI314"));

        System.out.println("List size = " + customLinkedList.size());
        System.out.println("List elements: " + customLinkedList);
        System.out.println("isEmpty() = " + customLinkedList.empty());
        customLinkedList.clear();
        System.out.println("Is empty after clear() = " + customLinkedList.empty());
        System.out.println("List elements: " + customLinkedList);
    }
}
