package OOPS.Interface.Example3;

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleep in a kennel.");
    }
}
