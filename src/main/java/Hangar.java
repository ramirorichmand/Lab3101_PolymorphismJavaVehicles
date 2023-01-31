 import java.util.ArrayList;

    public class Hangar {
        private ArrayList<Vehicle> vehicles;

        public Hangar() {
            vehicles = new ArrayList<Vehicle>();
        }

        public void addVehicle(Vehicle vehicle) {
            vehicles.add(vehicle);
        }

        public void removeVehicle(Vehicle vehicle) {
            vehicles.remove(vehicle);
        }

        public int getVehicleCount() {
            return vehicles.size();
        }

        public ArrayList<Vehicle> getVehicles() {
            return vehicles;
        }
    }


