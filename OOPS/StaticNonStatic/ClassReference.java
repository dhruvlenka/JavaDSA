package OOPS.StaticNonStatic;

//A static member can be accessed inside same class directly or by using class reference.
public class ClassReference {
    //static Variable
    public static int staticNumber = 110;

    //instance Variable
    int instaneNumber = 210;

    //static Method
    public static void staticMethod(){
        System.out.println("This is a static method");
        //accessing static variable directly
        System.out.println("Static number (direct access) " + staticNumber);
    }

    //instance method
    void instanceMethod(){
        System.out.println("This is instance method.");
        //can access both static and instance variable
        System.out.println("Static number (direct access) " + staticNumber);
        System.out.println("Instance number: " + instaneNumber);
    }
    public static void main(String[] args) {
        //accessing static members directly
        System.out.println("Accessing static members directly: " + staticNumber);

        //accessing static member using class reference
        System.out.println("Accessing static variable using class reference: " + ClassReference.staticNumber);
        System.out.println();

        //creating object to access instance members
        ClassReference staticMember = new ClassReference();
        System.out.println(staticMember.instaneNumber);

        //accessing instance method
        staticMember.instanceMethod();
        System.out.println();

        //modifying static variable directly
        staticNumber = 500;
        System.out.println("After modifications directly: " + staticNumber);

        //modifying static variable using class reference
        ClassReference.staticNumber = 1000;
        System.out.println("After modifications using class reference: " + staticNumber);




    }
}
