package homework.pattern.proxy;

public class Airport {
    public static void main(String[] args) {
        AirportService service = new AirportServiceProxy(true);
        service.accessService();

        AirportService restrictedService = new AirportServiceProxy(false);
        restrictedService.accessService();
    }
}
