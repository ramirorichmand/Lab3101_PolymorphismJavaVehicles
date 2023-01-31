public abstract class Vehicle {
    private String name;
    private boolean publicTravel;
    private String fuelType;
    private int maximumOccupancy;
    private String travelType;

    private String numberOfWheels;

    public Vehicle(String fuelType, int maximumOccupancy, String travelType) {
        this.fuelType = fuelType;
        this.maximumOccupancy = maximumOccupancy;
        this.travelType = travelType;
    }

    public Vehicle(String name, boolean publicTravel, String fuelType, int maximumOccupancy, String travelType) {
    }


    public abstract void startsEngine();
    public abstract void takeOff();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPublicTravel() {
        return publicTravel;
    }

    public void setPublicTravel(boolean publicTravel) {
        this.publicTravel = publicTravel;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getMaximumOccupancy() {
        return maximumOccupancy;
    }

    public String getTravelType() {
        return travelType;
    }

    public String getNumberOfWheels() {
        return numberOfWheels;
    }
}
