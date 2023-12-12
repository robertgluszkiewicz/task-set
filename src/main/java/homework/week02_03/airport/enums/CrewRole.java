package homework.week02_03.airport.enums;

public enum CrewRole {
    PILOT("Pilot", 0),
    FLIGHT_ATTENDANT("Flight attendant", 3),
    MECHANIC("Mechanic", 2),
    ENGINEER("Engineer", 1);

    private final String name;
    private final int code;

    static {
        System.out.println("Crew roles initialization...");
    }

    CrewRole(String name, int code) {
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
