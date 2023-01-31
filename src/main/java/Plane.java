public class Plane extends AirVehicle {
    private int altitude;

    public Plane(String fuelType, int maximumOccupancy, String travelType, int altitude) {
        super(fuelType, maximumOccupancy, travelType);
        this.altitude = altitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public void fly() {
        System.out.println("The plane is flying at altitude: " + altitude + " feet.");
    }

    public String isStartsEngine() {
        return  isStartsEngine();
    }

    public String isTakeOff() {
        return isTakeOff();
    }


    private int wingSpan;

    public Plane(String name, boolean publicTravel, String fuelType, int maximumOccupancy, String travelType, int wingSpan) {
            super(name, publicTravel, fuelType, maximumOccupancy, travelType);
            this.wingSpan = wingSpan;
        }

        public int getWingSpan() {
            return wingSpan;
        }

        public void takeOff() {
            System.out.println(this.getName() + " is taking off using its two engines.");
        }

        public void takeOff(int runwayLength) {
            System.out.println(this.getName() + " is taking off using its two engines on a runway with length " + runwayLength + "m.");
        }
    }

