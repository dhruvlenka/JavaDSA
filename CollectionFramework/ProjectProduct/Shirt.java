package CollectionFramework.ProjectProduct;

public class Shirt extends Product {
    int size;

    //non-parameterized constructor
    Shirt(){

    }
    //parameterized constructor
    Shirt(String brand, int price, String catg, int size, String color){
        super(brand, price, catg);
        this.size=size;
        this.color=color;
    }
    //converting to string
    public String toString() {
        return "Brand: "+brand+"\tPrice: "+price+"\tCategory :"+catg+"\tSize: "+size+"\tColor: "+color;
    }
}
