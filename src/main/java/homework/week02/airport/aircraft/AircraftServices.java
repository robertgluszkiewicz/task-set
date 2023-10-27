package homework.week02.airport.aircraft;

public interface AircraftServices {
    Position sendPosition(double[] inputData);
    boolean isConnectedToFlightController();
}
