package CollectionFramework.ProjectProduct;

public class Mobile extends Product {
    int ram;
    int storage;
    String battery;
    String processor;
    String oS;
    double size;
    String frontCamera;
    String rearCamera;

    Mobile(String brand, String model, String color, int price, String catg, int ram, int storage,
           String battery, String frontCamera, String rearCamera, String processor, String oS,
           double size){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.catg = catg;
        this.ram = ram;
        this.storage = storage;
        this.battery = battery;
        this.frontCamera = frontCamera;
        this.rearCamera = rearCamera;
        this.processor = processor;
        this.oS = oS;
        this.size = size;
    }

    public String toString() {
        return "Brand: " + brand +
                "\tModel: " + model +
                "\tColor: " + color +
                "\tPrice: " + price +
                "\tCategory: " + catg +
                "\tRam: " + ram +
                "\tStorage: " + storage +
                "\tBattery: " + battery +
                "\tFront Camera: " + frontCamera +
                "\tRear Camera: " + rearCamera +
                "\tProcessor: " + processor +
                "\tOperating System: " + oS +
                "\tSize: " + size;
    }
}
