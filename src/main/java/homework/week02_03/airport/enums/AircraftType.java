package homework.week02_03.airport.enums;

public enum AircraftType {
    PASSENGER("Passenger", 100),
    CARGO("Cargo", 200),
    JET("Jet", 300),
    LIGHT("Light" , 400),
    HELICOPTER("Helicopter", 500),
    OTHER("Other", 999);

    private final String name;
    private final int code;

    static {
        System.out.println("Aircraft types initialization...");
    }

    AircraftType(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }
}
