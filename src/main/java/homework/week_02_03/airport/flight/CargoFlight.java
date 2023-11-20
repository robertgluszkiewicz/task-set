package homework.week_02_03.airport.flight;

import homework.week_02_03.airport.aircraft.AircraftType;

public class CargoFlight extends Flight implements CargoBoardServices {
    private String cargoOwner;

    public CargoFlight(long id, FlightType flightType, AircraftType aircraftType, String cargoOwner) {
        super(id, flightType, aircraftType);
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
        return "ID: " + id + '\n' +
                "type: " + flightType + '\n' +
                "aircraft type: " + aircraftType + '\n' +
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
