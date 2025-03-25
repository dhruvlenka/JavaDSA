package OOPS;

public class Class_Play {
    static int x = 30;
    public static void test() {
        System.out.println("This is a static method.");
        System.out.println("x is: "+ x);
        demo();
    }
    public static void demo() {
        System.out.println("This is a static demo method.");
    }
    public void start() {
        System.out.println("This is a non-static ");
    }
    public void drive() {
        System.out.println("This is a non-static drive method.");
    }
    public static void main(String[] args) {
        System.out.println("This is a main method. ");
        test();
    }
}
