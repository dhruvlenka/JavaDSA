package OOPS.Constructor;

public class Car {
        Car() {
            this(12.5);
            System.out.println("Car no-arg constructor.");
        }
        Car(int x){
            this();
            System.out.println("Car int-arg constructor.");
        }
        Car(double x){
            System.out.println("Car double-arg constructor.");
    }

    public static void main(String[] args) {
        Car c1 = new Car(18);
        Car c2 = new Car(12.5);
    }
}
