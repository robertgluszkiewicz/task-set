package homework.week02_03.airport.person;

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
        if (!super.equals(o)) return false;

        Passenger passenger = (Passenger) o;

        if (!departureAirport.equals(passenger.departureAirport)) return false;
        return arrivalAirport.equals(passenger.arrivalAirport);
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + departureAirport.hashCode();
        result = 31 * result + arrivalAirport.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "name: " + getFirstName() + " " + getLastName() + " (" + departureAirport + " > " + arrivalAirport + ")";
    }
}
