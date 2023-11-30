package homework.week02_03.airport.enums;

public enum EmergencyLocatorTransmitter {
    AUTOMATIC_DEPLOYABLE("Automatic deployable", 406),
    AUTOMATIC_FIXED("Automatic fixed", 310),
    AUTOMATIC_PORTABLE("Automatic portable", 121.5);

    private final String name;
    private final double mhzFrequency;

    static {
        System.out.println("Emergency locator transmitters initialization...");
    }

    EmergencyLocatorTransmitter(String name, double mhzFrequency) {
        this.name = name;
        this.mhzFrequency = mhzFrequency;
    }

    public String getName() {
        return name;
    }

    public double getMhzFrequency() {
        return mhzFrequency;
    }
}
