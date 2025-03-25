import AccessModifier.CEAT;

//For AccessModifier
public class Car extends CEAT {
    public static void main(String[] args) {
        System.out.println("From Car Class");
        System.out.println("a is: " + CEAT.a);
        CEAT.test();
        System.out.println("b is: " + CEAT.b);
    }
}
