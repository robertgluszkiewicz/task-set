package homework.week02_03.airport.enums;

public enum FlightType {
    COMMERCIAL("Commercial", 10),
    MILITARY("Military", 20),
    PRIVATE("Private", 30);

    private final String name;
    private final int code;

    static {
        System.out.println("Flight types initialization...");
    }

    FlightType(String name, int code) {
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
