package Interfaces;

interface Drivable {
    public void drive();
}

class Car implements Drivable {
    public void drive() {
        System.out.println("Driving a car");
    }
}
    class Main {
        public static void main(String[] args) {
            Drivable myVehicle = new Car();
            myVehicle.drive();
        }

    }