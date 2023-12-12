package homework.week02_03.airport.aircraft;

import homework.week02_03.airport.enums.AircraftType;

public abstract class Aircraft {
    protected String manufacture;
    protected AircraftType aircraftType;
    protected int emptyWeight;
    protected int maxLoad;

    public Aircraft(String manufacture, AircraftType aircraftType, int emptyWeight, int maxLoad) {
        this.manufacture = manufacture;
        this.aircraftType = aircraftType;
        this.emptyWeight = emptyWeight;
        this.maxLoad = maxLoad;
    }

    public final void sendSosSignal() {
        System.out.println("Send SOS signal by radio");
    }
  
    public String getManufacture() {
        return manufacture;
    }

    public AircraftType getAircraftType() {
        return aircraftType;
    }

    public int getEmptyWeight() {
        return emptyWeight;
    }

    public int getMaxLoad() {
        return maxLoad;
    }
}
