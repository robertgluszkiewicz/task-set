import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import homework.week02.airport.aircraft.Airbus;
import homework.week02.airport.aircraft.AircraftType;
import homework.week02.airport.aircraft.Position;

public class TestAirbus {
    @Test
    void shouldSendPosition() {
        //Given
        Airbus airbus = new Airbus("Airbus", AircraftType.PASSENGER, 25000, 30000, "777X", "Lufthansa");
        double[] receivedPosition = {55.55, 22.22};
        //When
        Position expected = new Position(55.55, 22.22);
        Position actual = airbus.sendPosition(receivedPosition);
        //Then
        assertEquals(actual, expected);
    }
}
