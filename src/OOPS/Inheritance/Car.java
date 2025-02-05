package OOPS.Inheritance;

public class Car extends Vehicle{
        Car() {
            System.out.println("Car no-argument constructor.");
        }
        Car(int x){
            System.out.println("Car int-argument constructor: " + x);
        }
}
