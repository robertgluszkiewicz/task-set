package homework.week02_03.airport.flight;

import homework.week02_03.airport.enums.AircraftType;
import homework.week02_03.airport.enums.FlightMode;
import homework.week02_03.airport.enums.FlightType;

public class CargoFlight extends Flight implements CargoBoardServices {
    private String cargoOwner;

    public CargoFlight(long id, FlightType flightType, FlightMode flightMode, AircraftType aircraftType, String cargoOwner) {
        super(id, flightType, flightMode, aircraftType);
        this.cargoOwner = cargoOwner;
    }

    public String getCargoOwner() {
        return cargoOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CargoFlight that = (CargoFlight) o;

        return cargoOwner.equals(that.cargoOwner);
    }

    @Override
    public String toString() {
        return "ID: " + getId() + '\n' +
                "type: " + getFlightType() + '\n' +
                "mode: " + getFlightMode() + '\n' +
                "aircraft type: " + getAircraftType() + '\n' +
                "cargoOwner: " + cargoOwner + '\n';
    }

    @Override
    public int hashCode() {
        return cargoOwner.hashCode();
    }

    @Override
    public void fastenSeatbelts() {
        System.out.println("Workers, please fasten your seatbelt");
    }

    @Override
    public void unfastenSeatbelts() {
        System.out.println("Workers, you can unfasten your seatbelts");
    }

    @Override
    public void checkLoadStability() {
        System.out.println("Please check the load and securing straps.");
    }
}
