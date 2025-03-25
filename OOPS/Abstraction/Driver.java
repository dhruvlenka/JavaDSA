package OOPS.Abstraction;

public class Driver {
    public static void main(String[] args) {
        Vehicle v1 = new ElectricCar();
        v1.start();
        v1.stop();
        v1.drive();
        v1.acclerate();
        Car c1 = (Car) v1; //down-casting
        c1.playMusic();
        c1.openGate();

    }
}
