package OOPS.Constructor;

//Parent clas
class Vehicle {
    String type;

    Vehicle() {

    }
    //Parent-class constructor
    Vehicle(String type){
        this.type = type;
        System.out.println("Vehicle type: " + type);
    }
}

//child class
class Carr extends Vehicle  {
    String brand;
    String model;
    // Constructor 1: Calls parent class constructor using super()
    Carr(String brand){
        super("Car"); // Calls the parent class constructor
        this.brand = brand;
        System.out.println("Car Brand: " + brand);
    }
    // Constructor 2: Calls another constructor in the same class using this()
    Carr(String brand, String model) {
        this(brand);
        this.model = model;
        System.out.println("Car Model: " + model);

    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Carr carrrr = new Carr("Audi", "A6");
        System.out.println(carrrr);

    }
}
