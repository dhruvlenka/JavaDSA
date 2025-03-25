package CollectionFramework.ProjectProduct;

public class Product {
    String brand;
    String model;
    int price;
    String color;
    String catg;

    Product() {

    }

    Product(String brand, int price, String catg){
        this.brand = brand;
        this.price = price;
        this.catg = catg;
    }


    public String toString(){
        return "Brand: " + brand + "\tPrice: " + price + "\tCategory: " + catg;
    }

}
