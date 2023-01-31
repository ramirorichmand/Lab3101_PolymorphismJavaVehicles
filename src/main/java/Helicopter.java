public class Helicopter extends AirVehicle {
    private int currentRotationSpeed;

    public Helicopter(String fuelType, int maximumOccupancy, String travelType, int currentRotationSpeed) {
        super(fuelType, maximumOccupancy, travelType);
        this.currentRotationSpeed = currentRotationSpeed;
    }

    public int getCurrentRotationSpeed() {
        return currentRotationSpeed;
    }

    public void setCurrentRotationSpeed(int currentRotationSpeed) {
        this.currentRotationSpeed = currentRotationSpeed;
    }

    public void hover() {
        System.out.println("The helicopter is hovering with rotation speed: " + currentRotationSpeed + " RPM.");
    }
}
