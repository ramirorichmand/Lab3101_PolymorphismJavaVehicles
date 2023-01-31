public class VehicleTest {
    public static void main(String[] args) {
        // create a vehicle object
        Vehicle vehicle = new Vehicle("Vehicle", true, "Gas", 4, "Land") {
            @Override
            public void startsEngine() {

            }

            @Override
            public void takeOff() {

            }
        };

        // test the startsEngine method
        System.out.println("Expected Output : Vehicle engine has started");
        vehicle.startsEngine();

        // test the fuelType property
        System.out.println("Expected Output : Gas");
        System.out.println(vehicle.getFuelType());

        // test the maximumOccupancy property
        System.out.println("Expected Output : 4");
        System.out.println(vehicle.getMaximumOccupancy());
    }
}
