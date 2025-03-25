package OOPS.Constructor;

//example of: copy constructor
public class Fruit {
    String name;
    int price;
    double weight;

    Fruit(String name, int price, double weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    //copy constructor
    Fruit(Fruit fr){
       // this(fr.name, fr.price, fr.weight); //we can write as this
        this.name = fr.name;
        this.price = fr.price;
        this.weight = fr.weight;
    }

    //constructor overloading
    Fruit(Fruit fr, double weight){
        this.name = fr.name;
        this.price = fr.price;
        this.weight = weight;
    }

    public void getDetails(){
        System.out.println("Fruit Name: " + name);
        System.out.println("Fruit Price: " + price);
        System.out.println("Fruit Weight: " + weight);
    }
}
