package OOPS.Interface;

public class Driver {
    public static void main(String[] args) {
        Vehicle v1 = new ElectricCar();
        v1.start();
        v1.stop();
        System.out.println("-----------------");

        // 'Car' is abstract; cannot be instantiated: Car cc = new Car();
        Car c1 = (Car) v1; //downcasting
        c1.start();
        c1.stop();
        c1.openGate();
    }
}
