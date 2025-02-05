package OOPS.Interface.Example4;

public class Driver {
    public static void main(String[] args) {
        Greeting.welcome(); //calling static method from the interface

        Person p = new Person();
        p.sayHello();
        p.sayGoodbye();

        Greeting g = new Person();
        g.sayHello();
        g.sayGoodbye();
    }
}
