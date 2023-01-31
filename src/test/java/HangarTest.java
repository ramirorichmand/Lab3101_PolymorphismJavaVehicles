public class HangarTest {
    public static void main(String[] args) {
        Hangar myHangar = new Hangar();

       //FIX!! Vehicle car = new Car("name", false, "petrol" );
        Vehicle helicopter = new Helicopter("Jet fuel", 2, 6);

       //FIX!! Vehicle car = new Car("name", false) ;
        myHangar.addVehicle(car);
        myHangar.addVehicle(helicopter);

        System.out.println("Number of vehicles in Hangar: " + myHangar.getVehicleCount());

        for (Vehicle v : myHangar.getVehicles()) {
            System.out.println("Vehicle Type: " + v.getClass().getSimpleName());
            System.out.println("Fuel Type: " + v.getFuelType());
            System.out.println("Number of Wheels: " + v.getNumberOfWheels());
            System.out.println("Maximum Occupancy: " + v.getMaximumOccupancy());
            System.out.println();
        }

        myHangar.removeVehicle(car);
        System.out.println("Number of vehicles in Hangar after removing one: " + myHangar.getVehicleCount());
    }
}
