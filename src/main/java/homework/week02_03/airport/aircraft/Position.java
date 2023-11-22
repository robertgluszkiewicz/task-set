package homework.week02_03.airport.aircraft;

public class Position {
    private double altitude;
    private double latitude;

    public Position(double altitude, double latitude) {
        this.altitude = altitude;
        this.latitude = latitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (Double.compare(position.altitude, altitude) != 0) return false;
        return Double.compare(position.latitude, latitude) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(altitude);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(latitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Position{" +
                "altitude=" + altitude +
                ", latitude=" + latitude +
                '}';
    }
}
