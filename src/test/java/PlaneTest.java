public class PlaneTest {
    public static void main(String[] args) {
        Plane boeing747 = new Plane("Boeing 747", 500, "Air", 500);
        System.out.println("Name of the plane: " + boeing747.getName());
        System.out.println("Public travel: " + boeing747.isPublicTravel());
        System.out.println("Fuel Type: " + boeing747.getFuelType());
        System.out.println("Maximum occupancy: " + boeing747.getMaximumOccupancy());
        System.out.println("Travel Type: " + boeing747.getTravelType());
        System.out.println("Engine started: " + boeing747.isStartsEngine());
        System.out.println("Ready for take off: " + boeing747.isTakeOff());
    }
}
