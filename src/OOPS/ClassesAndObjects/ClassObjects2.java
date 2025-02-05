package OOPS.ClassesAndObjects;

// Object and Class Example: main within the class
public class ClassObjects2 {
    String model = "Oppo Pro";
    int ram = 8;
    int storage = 256;
    int price = 29460;
    int battery = 6000;


    ClassObjects2(){

    }

    //parametrized constructor
    ClassObjects2(String model, int ram, int storage, int price, int battery){
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.battery = battery;
    }

    public static void main(String[] args) {
        ClassObjects2 samsung = new ClassObjects2("Samsung s23", 8, 64, 75000, 6000);
        System.out.println(samsung.model);
        System.out.println(samsung.ram);
        System.out.println(samsung.storage);
        System.out.println(samsung.battery);
        System.out.println(samsung.price);

        ClassObjects2 oppo = new ClassObjects2();
        System.out.println(oppo.model);
        System.out.println(oppo.ram);
        System.out.println(oppo.storage);
        System.out.println(oppo.battery);
        System.out.println(oppo.price);
    }
}
