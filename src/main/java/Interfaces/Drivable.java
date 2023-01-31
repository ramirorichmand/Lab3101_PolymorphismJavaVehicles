package Interfaces;

interface Drivable {
    public void drive();
}

class Car implements Drivable {
    public void drive() {
        System.out.println("Driving a car");
    }
}
