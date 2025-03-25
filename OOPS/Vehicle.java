package OOPS;

public class Vehicle {
    String company;
    String model;
    int price;
    int milege;
    double weight;
    int launchedYear;

    public void setDetails(String company, String model, int price, int milege, double weight, int launchedYear){
        this.company = company;
        this.model = model;
        this.price = price;
        this.milege = milege;
        this.weight = weight;
        this.launchedYear  = launchedYear;
    }

    public void getDetails(){
        System.out.println("Company is: " + company);
        System.out.println("Model "+model);
        System.out.println("Price " + price);
        System.out.println("Milege " + milege);
        System.out.println("Weight " + weight);
        System.out.println("Launched Year " + launchedYear);
    }



    public static void main(String[] args) {
        Vehicle vc = new Vehicle();
        vc.setDetails("Audi", "A7", 70000, 5,200.5,2020);
        vc.getDetails();

    }
}
