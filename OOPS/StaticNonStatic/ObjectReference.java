package OOPS.StaticNonStatic;

//Inside other class a static member can be accessed by using object reference.
public class ObjectReference {
    public static void main(String[] args) {
        //creating an object of ClassReference
        ClassReference obj = new ClassReference();

        //proper way: Accessing static members using class name
        System.out.println("Using class name:");
        System.out.println("Static number: " + ClassReference.staticNumber);
        ClassReference.staticMethod();

        //possible but not recommended: using object reference
        System.out.println("\nUsing object reference (not recommended):");
        System.out.println("Static number: " + obj.staticNumber);
        obj.staticMethod();

        //modifying static member using class name
        ClassReference.staticNumber = 100000;
        System.out.println("\nAfter modification using class name: " + ClassReference.staticNumber);

        //modification using object reference
        obj.staticNumber = 200000;
        System.out.println("After modification using object reference: " + obj.staticNumber);

        //accessing instance member (requires object)
        System.out.println("\nInstance number: " + obj.instaneNumber);
    }
}
