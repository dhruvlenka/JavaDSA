package OOPS.Typecasting;

public class NarrowingExplicit {
    public static void main(String[] args) {
        double x = 48.62;
        int y = (int)x; //manually converting
        System.out.println(x);
        System.out.println(y);

        System.out.println("=============");
        System.out.println((int)42.6234);
        System.out.println((int)'c');
        System.out.println((char)100);

        System.out.println("==============");
        int a = 120;
        int b = 260;
        byte p=(byte)a;
        byte q = (byte)b;
        System.out.println(p);
        System.out.println(q);

    }
}
