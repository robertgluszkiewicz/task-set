package homework.pattern.proxy;

public class AirportServiceProxy implements AirportService {
    private RealAirportService realService;
    private boolean accessGranted;

    public AirportServiceProxy(boolean access) {
        this.realService = new RealAirportService();
        this.accessGranted = access;
    }

    @Override
    public void accessService() {
        if (accessGranted) {
            realService.accessService();
        } else {
            System.out.println("Access denied");
        }
    }
}

