package CollectionFramework.ProjectProduct;

public class Grocery extends Product {
    double weight;
    String groceryCategory;

    Grocery(String groceryCategory, String catg, String brand, double weight, int price){
        this.groceryCategory = groceryCategory;
        this.catg = catg;
        this.brand = brand;
        this.weight = weight;
        this.price = price;

    }
    public String toString() {
        return "Grocery Category: " + groceryCategory +
                "\tCategory: "+ catg +
                "\tBrand: " + brand +
                "\tWeight :"+ weight +
                "\tPrice: " + price;
    }
}
