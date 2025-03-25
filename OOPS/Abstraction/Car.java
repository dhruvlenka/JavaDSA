package OOPS.Abstraction;

public abstract class Car extends Vehicle{
    int hp; //horsepower
    Car(){
        //non-argument constructor
    }
    //Argument/Parameterized constructor
    Car(String name, double price, int hp){
        super(name, price);
        this.hp=hp;
    }
    //abstract method
    public abstract void openGate();

    //concrete method
    public void playMusic() {
        System.out.println("Play Music in Car");
    }
}
