package homework.pattern.proxy;

public class RealAirportService implements AirportService {
    @Override
    public void accessService() {
        System.out.println("Accessing airport service");
    }
}

