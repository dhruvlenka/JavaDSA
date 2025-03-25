package OOPS.Encapsulation;

public class LaptopDriver {
    public static void main(String[] args) {
        Laptop lp = new Laptop();
        lp.setPassword(123456);
        System.out.println("Good Morning " + lp.getName() + "!");
    }
}
