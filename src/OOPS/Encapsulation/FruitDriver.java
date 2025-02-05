package OOPS.Encapsulation;

public class FruitDriver {
    public static void main(String[] args) {
        Fruit fr = new Fruit();
        fr.setName("Banana");
        System.out.println("Fruit Price: " + fr.getRate());
    }
}
