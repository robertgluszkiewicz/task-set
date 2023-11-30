package homework.week02_03.airport.enums;

public enum FlightMode {
    STANDARD("Standard", false),
    EMERGENCY("Emergency", true);

    private final String name;
    private final boolean priority;

    static {
        System.out.println("Flight modes initialization...");
    }

    FlightMode(String name, boolean priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public boolean isPriority() {
        return priority;
    }
}
