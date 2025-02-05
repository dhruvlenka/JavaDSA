package OOPS.WrapperClass;

public class Objecttt {
    public static void main(String[] args) {
        Object o1 = "Jatin";
        Object o2 = 10;
        Object o3 = 45.2;
        Object o4 = true;
        Object o5 = false;
        Object o6 = 'D';
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);
        System.out.println(o5);
        System.out.println(o6);

        System.out.println("===============");

        Object o7 = 234;
        int x = (Integer) o7;
        System.out.println(x+100);
        System.out.println((Integer)o7+100);

    }
}
