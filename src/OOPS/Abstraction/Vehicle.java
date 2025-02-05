package OOPS.Abstraction;

public abstract class Vehicle {
    //non-static data members
    String name;
    double price;
    Vehicle() {
        //constructor for load non-static members/variables.
    }
    Vehicle(String name, double price){
        this.name = name;
        this.price = price;
    }
    //abstract methods
    public abstract void drive(); //connection
    public abstract void acclerate();

    // Concrete Method
    public void start() {
        System.out.println("Start the vehicle.");
    }
    public void stop() {
        System.out.println("Stop the vehicle.");
    }

}