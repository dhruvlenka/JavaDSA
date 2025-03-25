package OOPS.Abstraction;

class ElectricCar extends Car {
    int volt;
    ElectricCar(){

    }
    ElectricCar(String name, double price, int hp, int volt){
        super(name, price, hp);
        this.volt=volt;
    }
    @Override
    public void drive() {
        System.out.println("Driving EV."); //execution
    }

    @Override
    public void acclerate() {
        System.out.println("Accelerate EV.");
    }

    @Override
    public void openGate() {
        System.out.println("Open gate in EV.");
    }
}