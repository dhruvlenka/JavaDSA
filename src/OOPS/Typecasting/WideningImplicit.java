package OOPS.Typecasting;

public class WideningImplicit {
    public static void main(String[] args) {
        int x = 235;
        double y = x;
        System.out.println(x);
        System.out.println(y);

        System.out.println("==================");
        char a = '@';
        int b  = a;
        System.out.println(a);
        System.out.println(b);

        System.out.println("==================");
        byte p = 20;
        int q = p;

        System.out.println(p);
        System.out.println(q);
    }
}
