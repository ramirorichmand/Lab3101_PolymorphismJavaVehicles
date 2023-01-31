public class AirVehicleTest {
    public static void main(String[] args) {
        AirVehicle helicopter = new Helicopter("Apache", true, "Petrol", 4, "Air", 2000, 5);
        AirVehicle plane = new Plane("Boeing 747", true, "Jet fuel", 500, "Air", 1000, 9);

        System.out.println("Helicopter name: " + helicopter.getName());
        System.out.println("Helicopter fuel type: " + helicopter.getFuelType());
        System.out.println("Helicopter maximum occupancy: " + helicopter.getMaximumOccupancy());
        System.out.println("Helicopter travel type: " + helicopter.getTravelType());
        helicopter.startsEngine();
        helicopter.takeOff();

        System.out.println("\nPlane name: " + plane.getName());
        System.out.println("Plane fuel type: " + plane.getFuelType());
        System.out.println("Plane maximum occupancy: " + plane.getMaximumOccupancy());
        System.out.println("Plane travel type: " + plane.getTravelType());
        plane.startsEngine();
        plane.takeOff();
    }
}
