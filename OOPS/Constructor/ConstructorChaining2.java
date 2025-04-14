package OOPS.Constructor;

//parent Class
class Vehicles {
     String type;
     int wheels;

    //parent class constructor
    Vehicles(String type, int wheels){
        this.type = type;
        this.wheels = wheels;
        System.out.println("Vehicle Constructor: " + type + " with " + wheels + " wheels ");
    }
}

class Cars extends Vehicles {
    private String model;
    private String color;

    //constructor 1: basic constructor using super()
    public Cars(String model){
        super("Car",4);
        this.model = model;
        this.color = "Default";
        System.out.println("Car constructor 1: " + model);
    }

    //constructor 2: using this() to chain to constructor 1
    public Cars(String model, String color){
        this(model);
        this.color = color;
        System.out.println("Car constructor 2: " + color);

    }

    //constructor 3: using both this() and super()
    public Cars(String model, String color, int wheels){
        super("Custom Car", wheels);
        this.model = model;
        this.color = color;
        System.out.println("Car constructor 3: custom car created.");
    }

    //displaying details
    public void displayDetails() {
        System.out.println("Type: " + super.type +
                           " Model: " + model +
                           " Color: " + color +
                           " Wheels: " + super.wheels
                );
    }
}
public class ConstructorChaining2 {
    public static void main(String[] args) {
        System.out.println("Creating Car 1:");
        Cars car1 = new Cars("Audi A6");
        car1.displayDetails();

        System.out.println("\n Creating Car 2:");
        Cars car2 = new Cars("BMW", "Black");
        car2.displayDetails();

        System.out.println("\n Creating Car 3:");
        Cars car3 = new Cars("Mercedes", "White, 6");
        car3.displayDetails();
    }
}
