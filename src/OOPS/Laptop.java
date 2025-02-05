package OOPS;

import Graph.SrcToDest;

public class Laptop {
    String company;
    String model;
    int price;
    double screenSize;
    int launchedYear;

    public void setLaptopDetails(String company, String model, int price, double screenSize, int launchedYear){
        this.company = company;
        this.model = model;
        this.price = price;
        this.screenSize = screenSize;
        this.launchedYear = launchedYear;
    }


    public void getLaptopDetails(){
        System.out.println("Company is: " + company);
        System.out.println("Model "+model);
        System.out.println("Price " + price);
        System.out.println("Screen Size: "+ screenSize);
        System.out.println("Launched Year " + launchedYear);
    }

    public static void main(String[] args) {
        Laptop lp = new Laptop();
        lp.setLaptopDetails("Apple", "M1", 171000, 14.0, 2021);
        lp.getLaptopDetails();

    }
}
