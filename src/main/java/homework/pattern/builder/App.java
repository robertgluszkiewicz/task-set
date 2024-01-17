package homework.pattern.builder;

public class App {
    public static void main(String[] args) {
        FlightDocument document = new FlightDocument.Builder()
                .flightNumber("11123")
                .airline("PanAm")
                .departureAirport("DET")
                .arrivalAirport("ALA")
                .departureTime("1:00")
                .arrivalTime("3:00")
                .build();

        System.out.println(document);
    }
}
