package OOPS.Interface.Example3;

public class Driver {
    public static void main(String[] args) {
        Animal dog = new Dog(); //Polymorphism
        dog.eat();
        dog.sleep();

        Animal cat = new Cat();
        cat.eat();
        cat.sleep();
    }
}
