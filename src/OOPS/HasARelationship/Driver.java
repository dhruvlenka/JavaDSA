package OOPS.HasARelationship;

public class Driver {
    public static void main(String[] args) {
        Car c1 = new Car("Audi", 50000000, new Engine(700, 8, "Petrol"));
        c1.getCarDetails();
        System.out.println();

        Car c2 = new Car("Porsche 911 GT3 RS", 6000000);
        c2.getCarDetails();
        System.out.println();

        //Aggregation
        Engine e = new Engine(100,5,"Petrol and Diesel");
        Car c3 = new Car("Jaguar", 2000000, e);
        c3.getCarDetails();
    }
}
