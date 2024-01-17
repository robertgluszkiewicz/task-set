package homework.pattern.decorator;

public class App {
    public static void main(String[] args) {
        Airport basicAirport = new BasicAirport();
        Airport internationalAirport = new InternationalAirportDecorator(basicAirport);
        Airport cargoAndInternationalAirport = new CargoAirportDecorator(internationalAirport);

        System.out.println("Basic Airport: " + basicAirport.getDescription());
        System.out.println("International Airport: " + internationalAirport.getDescription());
        System.out.println("International and Cargo Airport: " + cargoAndInternationalAirport.getDescription());
    }
}
