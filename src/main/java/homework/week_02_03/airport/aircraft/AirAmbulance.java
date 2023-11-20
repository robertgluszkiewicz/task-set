package homework.week_02_03.airport.aircraft;

public final class AirAmbulance {
    public static final String EMERGENCY_PHONE_NUMBER = "911";

    public static void locateInjuredPerson() {
        System.out.println("Static method: Locate the injured person and call for: " + EMERGENCY_PHONE_NUMBER);
    }

    static {
        System.out.println("Static block: I am listening for SOS signal or a rescue order");
    }
}
