package OOPS.Constructor;

public class FruitDriver {

    public static void main(String[] args) {
        Fruit f1 = new Fruit("mango", 100, 2.5);
        Fruit f2 = new Fruit("orange", 100, 3.5);
        Fruit f3 = new Fruit("apple", 100, 2.2);
        Fruit f4 = new Fruit("watermelon", 100, 5.5);
        Fruit f5 = new Fruit("guava", 100, 2.0);
        Fruit f6 = new Fruit(f1);

        f1.getDetails();
        System.out.println();
        f2.getDetails();
        System.out.println();
        f3.getDetails();
        System.out.println();
        f4.getDetails();
        System.out.println();
        f5.getDetails();
        System.out.println();
        f6.getDetails();

    }
}
