package homework.week02.airport.person;

public class Passenger extends Person {
    private String departureAirport;
    private String arrivalAirport;

    public Passenger(String firstName, String lastName, String departureAirport, String arrivalAirport) {
        super(firstName, lastName);
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passenger passenger = (Passenger) o;

        if (!departureAirport.equals(passenger.departureAirport)) return false;
        return arrivalAirport.equals(passenger.arrivalAirport);
    }

    @Override
    public int hashCode() {
        int result = departureAirport.hashCode();
        result = 31 * result + arrivalAirport.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "name: " + firstName + " " + lastName + " (" + departureAirport + " > " + arrivalAirport + ")";
    }
}
