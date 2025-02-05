package OOPS.Interface.Example3;

// Implement the Interface in a Class
public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat eats fish and drinks milks.");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps on a cushion.");
    }
}
