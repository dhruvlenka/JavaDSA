package CollectionFramework.ProjectProduct;

public class Electronics extends Product {
    double size;
    String electronicsCategory;

    Electronics(String brand, String model, int price, double size, String color, String catg, String electronicsCategory){
        this.brand = brand;
        this.model  = model;
        this.price = price;
        this.size = size;
        this.color = color;
        this.catg = catg;
        this.electronicsCategory = electronicsCategory;
    }

    public String toString(){
        return "Brand: " + brand +
                "\tModel: " + model +
                "\tPrice: " + price +
                "\tColor: " + color +
                "\tCategory: " + catg +
                "\tElectronics Category " + electronicsCategory +
                "\tSize: " + size;
    }
}
