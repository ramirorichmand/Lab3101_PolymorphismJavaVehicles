public class AirVehicle extends Vehicle {

    public AirVehicle(String fuelType, int maximumOccupancy, String travelType) {
        super(fuelType, maximumOccupancy, travelType);
    }

    public AirVehicle(String name, boolean publicTravel, String fuelType, int maximumOccupancy, String travelType) {
        super(name, publicTravel, fuelType, maximumOccupancy, travelType);
    }

    @Override
    public void startsEngine() {
        System.out.println("The air vehicle's engine has started.");
    }

    @Override
    public void takeOff() {
        System.out.println("The air vehicle has taken off.");
    }
}
