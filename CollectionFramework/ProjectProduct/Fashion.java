package CollectionFramework.ProjectProduct;

public class Fashion extends Product {
    int size;
    String gender;
    String clothingCategory;

    Fashion() {

    }

    //parameterized constructor
    Fashion(String gender, String brand, int price, String catg, String clothingCategory, int size, String color){
     //   super(brand, price, catg);
        this.brand = brand;
        this.price = price;
        this.catg = catg;
        this.gender = gender;
        this.clothingCategory = clothingCategory;
        this.size=size;
        this.color=color;
    }
    //converting to string
    public String toString() {
        return "Gender: " + gender +
                "\tBrand: "+ brand +
                "\tPrice: " + price +
                "\tCategory :"+ catg +
                "\tClothing Category: " + clothingCategory +
                "\tSize: " + size +
                "\tColor: "+color;
    }
}
