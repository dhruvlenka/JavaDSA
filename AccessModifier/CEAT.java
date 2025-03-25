package AccessModifier;

public class CEAT {
    public static int a = 12;
    protected static int b = 20;
    static int c = 50;
    private static int d=60;

    public static void test(){
        System.out.println("public static test method");
    }

    protected static void demo() {
        System.out.println("protected static demo method");
    }
     static void start() {
        System.out.println("default start method");
    }
    private static void driver() {
        System.out.println("private driver method");
    }

    public static void main(String[] args) {
        System.out.println("From CEAT METHOD");
        System.out.println("a is: " + a);

        CEAT.driver();
    }
}
