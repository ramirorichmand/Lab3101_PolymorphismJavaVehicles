import org.junit.jupiter.api.Test;

public class HelicopterTest {

    @Test
    public void testHelicopterProperties() {
        Helicopter helicopter = new Helicopter("Kerosene", 10, "Air", 4);

        assert helicopter.getName().equals("Bell 505");
        assert !helicopter.isPublicTravel();
        assert helicopter.getFuelType() == FuelType.AVGAS;
        assert helicopter.getMaximumOccupancy() == 4;
        assert helicopter.getTravelType() == TravelType.AIR;
    }

    @Test
    public void testHelicopterMethods() {
        Helicopter helicopter = new Helicopter("Bell 505", false, FuelType.AVGAS, 4, TravelType.AIR, true, true);

        helicopter.startEngine();
        assert helicopter.engineIsRunning() == true;

        helicopter.takeOff();
        assert helicopter.isFlying() == true;
    }
}
