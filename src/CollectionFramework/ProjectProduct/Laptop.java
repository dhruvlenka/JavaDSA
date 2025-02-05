package CollectionFramework.ProjectProduct;

public class Laptop extends Product {
    int ram;
    int storage;
    String battery;
    String processor;
    String oS;
    double size;

    Laptop(String brand, String model, String color, int price, String catg,int ram, int storage,
           String battery, String processor, String oS,
           double size) {
        this.brand = brand;
        this.price = price;
        this.catg = catg;
        this.model = model;
        this.color = color;
        this.ram = ram;
        this.storage = storage;
        this.battery = battery;
        this.processor = processor;
        this.oS = oS;
        this.size = size;

    }

    public String toString(){
        return "Brand: " + brand +
                "\tModel: " + model +
                "\tColor: " + color +
                "\tPrice: " + price +
                "\tCategory: " + catg +
                "\tRam: " + ram +
                "\tStorage" + storage +
                "\tProcessor: " + processor +
                "\tOperating System: " + oS +
                "\tSize: " + size;
    }
}
