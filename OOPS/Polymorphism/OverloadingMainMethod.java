package OOPS.Polymorphism;

public class OverloadingMainMethod {
    public static void main(String args) {
        System.out.println("I am String");
    }

    public static void main(double args) {
        System.out.println("I am double");
    }

    public static void main(int args, double d) {
        System.out.println("I am int and double");
    }

    public static void main(String[] args) {
        main("def");
        main(20);
        main(20.5);
        main(10, 4.5);
    }
}
