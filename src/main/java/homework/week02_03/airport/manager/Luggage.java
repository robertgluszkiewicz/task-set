package homework.week02_03.airport.manager;

import java.util.Map;
import java.util.Set;

import homework.week02_03.airport.person.Person;

public class Luggage {
    public static void printLuggage(Map<Person, Set<String>> luggage) {
        System.out.println("Luggage map: ");
        for (Map.Entry<Person, Set<String>> entry : luggage.entrySet()) {
            System.out.println(
                    entry.getKey().getFirstName() + " " + entry.getKey().getLastName() + ": " + entry.getValue());
        }
        System.out.println();
    }
}
