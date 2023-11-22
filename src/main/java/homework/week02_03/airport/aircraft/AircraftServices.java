package homework.week02_03.airport.aircraft;

public interface AircraftServices {
    Position sendPosition(double[] inputData);
    boolean isConnectedToFlightController();
}
