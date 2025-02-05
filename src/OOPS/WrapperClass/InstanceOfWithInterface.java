package OOPS.WrapperClass;

interface Electronics {}
class Laptops implements Electronics {}


public class InstanceOfWithInterface {
    public static void main(String[] args) {
        Electronics e = new Laptops();
        System.out.println(e instanceof Electronics);
        System.out.println(e instanceof Laptops);
    }
}
