package homework.week02.airport.manager;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import homework.week02.airport.person.CrewMember;
import homework.week02.airport.person.Person;

public class Checkin {
    public static Deque<Person> setQueueOrder(List<Person> persons) {
        Deque<Person> personQueue = new ArrayDeque<>();
        Deque<Person> priorityQueue = new ArrayDeque<>();
        Deque<Person> standardQueue = new ArrayDeque<>();

        for (Person person : persons) {
            if (person instanceof CrewMember) {
                priorityQueue.offer(person);
            } else {
                standardQueue.offer(person);
            }
        }

        personQueue.addAll(priorityQueue);
        personQueue.addAll(standardQueue);

        System.out.println("Queue in order contains " + personQueue.size() + " persons:");
        personQueue.forEach(System.out::println);
        System.out.println();

        return personQueue;
    }

    public static List<Person> checkThePassenger(Deque<Person> personsToCheck) {
        List<Person> checkedPersons = new LinkedList<>();

        Iterator<Person> iterator = personsToCheck.iterator();
        while (iterator.hasNext()) {
            System.out.println("Checking... " + personsToCheck.peek());
            checkedPersons.add(iterator.next());
            personsToCheck.poll();
            System.out.println(personsToCheck.size() + " persons left to check");
            System.out.println();
        }
        return checkedPersons;
    }
}
