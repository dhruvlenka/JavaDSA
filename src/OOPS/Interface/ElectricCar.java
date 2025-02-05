package OOPS.Interface;

public class ElectricCar implements Car {
    @Override
    public void start() {
        System.out.println("I am the start method, and I am overridden in the ElectricCar class.");
    }

    @Override
    public void stop() {
        System.out.println("I am the stop method, and I am overridden in the ElectricCar class.");
    }

    @Override
    public void openGate() {
        System.out.println("I am the openGate method, and I am overridden in the ElectricCar class.");
    }
}