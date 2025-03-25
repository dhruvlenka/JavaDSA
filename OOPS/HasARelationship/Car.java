package OOPS.HasARelationship;

public class Car {
    String name = "McLaren";
    double price;
    Engine e = new Engine(120,8,"Petrol");

    Car() {

    }
    Car(String name, double price){
        this.name = name;
        this.price = price;
    }
    Car(String name, double price, Engine e){
        this.name = name;
        this.price = price;
        this.e = e;
    }
    public void getCarDetails(){
        System.out.println("Car Name: " + name);
        System.out.println("Price is: " + price);
        e.getEngineDetails();
    }
}
