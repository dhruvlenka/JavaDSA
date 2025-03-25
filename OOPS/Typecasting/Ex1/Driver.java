package OOPS.Typecasting.Ex1;

public class Driver {
    public static void main(String[] args) {
        Electronics e1 = new Mobile();
        System.out.println(e1.eProduct);
        System.out.println(e1.price);

        System.out.println("--------------------------------");
        System.out.println(new Mobile().mob);
        System.out.println(new Mobile().price);

        System.out.println("--------------------------------");
        System.out.println(new Laptop().lapi);
        System.out.println(new Laptop().price);

        System.out.println("--------------------------------");
        System.out.println(new Camera().cam);
        System.out.println(new Camera().price);

    }
}
