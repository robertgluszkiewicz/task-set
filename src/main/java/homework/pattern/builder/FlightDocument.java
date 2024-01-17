package homework.pattern.builder;

public class FlightDocument {
    private String flightNumber;
    private String airline;
    private String departureAirport;
    private String arrivalAirport;
    private String departureTime;
    private String arrivalTime;

    private FlightDocument(Builder builder) {
        this.flightNumber = builder.flightNumber;
        this.airline = builder.airline;
        this.departureAirport = builder.departureAirport;
        this.arrivalAirport = builder.arrivalAirport;
        this.departureTime = builder.departureTime;
        this.arrivalTime = builder.arrivalTime;
    }

    public static class Builder {
        private String flightNumber;
        private String airline;
        private String departureAirport;
        private String arrivalAirport;
        private String departureTime;
        private String arrivalTime;

        public Builder flightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
            return this;
        }

        public Builder airline(String airline) {
            this.airline = airline;
            return this;
        }

        public Builder departureAirport(String airport) {
            this.departureAirport = airport;
            return this;
        }

        public Builder arrivalAirport(String airport) {
            this.arrivalAirport = airport;
            return this;
        }

        public Builder departureTime(String time) {
            this.departureTime = time;
            return this;
        }

        public Builder arrivalTime(String time) {
            this.arrivalTime = time;
            return this;
        }

        public FlightDocument build() {
            return new FlightDocument(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "flightNumber='" + flightNumber + '\'' +
                    ", airline='" + airline + '\'' +
                    ", departureAirport='" + departureAirport + '\'' +
                    ", arrivalAirport='" + arrivalAirport + '\'' +
                    ", departureTime='" + departureTime + '\'' +
                    ", arrivalTime='" + arrivalTime + '\'' +
                    '}';
        }
    }
}
