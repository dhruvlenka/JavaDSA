package OOPS;

class Car {
    void model(){
        System.out.println("Porsche 911 Carerra");
    }
}

class Porsche extends Car {
    @Override
    void model(){
        System.out.println("Porsche 911 GT3 RS");
    }
}
public class VirtualKeyword {
    public static void main(String[] args) {
        Car car = new Car();
        car.model();

        Car porsche = new Porsche();
        porsche.model();
    }
}
