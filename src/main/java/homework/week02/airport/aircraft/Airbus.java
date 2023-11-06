package homework.week02.airport.aircraft;

import java.util.Random;

public class Airbus extends Aircraft implements AircraftServices {
    private String model;
    private String owner;

    public Airbus(String manufacture, AircraftType aircraftType, int emptyWeight, int maxLoad, String model, String owner) {
        super(manufacture, aircraftType, emptyWeight, maxLoad);
        this.model = model;
        this.owner = owner;
    }
    @Override
    public Position sendPosition(double[] inputData) {
        Position position = new Position(inputData[0], inputData[1]);
        return position;
    }

    @Override
    public boolean isConnectedToFlightController() {
        Random random = new Random();
        return random.nextBoolean();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airbus airbus = (Airbus) o;

        if (!model.equals(airbus.model)) return false;
        return owner.equals(airbus.owner);
    }

    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + owner.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "manufacture: " + manufacture + '\n' +
                "owner: " + owner + '\n' +
                "model: " + model + '\n' +
                "aircraft type: " + aircraftType + '\n' +
                "empty weight: " + emptyWeight + '\n' +
                "max load: " + maxLoad;
    }
}
