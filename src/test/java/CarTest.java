public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Toyota", false, "Petrol", 4, "Terrestrial", 4, 50);

        System.out.println("Car Name: " + car.getName());
        System.out.println("Public Travel: " + car.isPublicTravel());
        System.out.println("Fuel Type: " + car.getFuelType());
        System.out.println("Maximum Occupancy: " + car.getMaximumOccupancy());
        System.out.println("Travel Type: " + car.getTravelType());

        System.out.println("Starting Engine: ");
        car.startEngine();

        System.out.println("Taking Off: ");
        car.takeOff();
    }
}
