public class Car extends Vehicle {
    private int numberOfDoors;
    private int currentSpeed;

    public Car(String name, boolean publicTravel, String fuelType, int maximumOccupancy, String travelType, int numberOfDoors, int currentSpeed) {
        super(name, publicTravel, fuelType, maximumOccupancy, travelType);
        this.numberOfDoors = numberOfDoors;
        this.currentSpeed = currentSpeed;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void drive() {
        System.out.println("The car is driving at a speed of " + currentSpeed + " km/h.");
    }

    @Override
    public void startsEngine() {

    }

    @Override
    public void takeOff() {

    }

    public void startEngine() {
    }
}
