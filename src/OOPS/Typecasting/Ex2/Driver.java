package OOPS.Typecasting.Ex2;

public class Driver {
    public static void main(String[] args) {
        Shape s1 = new Circle(); //upcasting
        Shape s2 = new Rectangle();
        Shape s3 = new Triangle();
        // it can only access the parent data because it's upcasting.
        System.out.println(s1.s);

             //typecast operator: (Circle)
        Circle c1 = (Circle) s1; //down-casting
        //it can access both parent and child data because it's down-casting.
        System.out.println(c1.c);
        System.out.println(c1.s);
    }
}
