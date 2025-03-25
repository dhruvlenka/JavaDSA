package OOPS.Polymorphism;

public class Calculator {
    //same method but different in arguments: overloading
    public static void add(int a, int b){
        System.out.println("From First Add Method: " + (a+b));
    }
    public static void add(int a, int b, double d){
        System.out.println("From Second Add Method: " + (a+b+d));
    }
    public static void add(double a, int b){
        System.out.println("From Third Add Method: " + (a+b));
    }

    //connection is provided here by compiler
    public static void main(String[] args) {
        Calculator.add(5, 500);
        Calculator.add(5,10,5.7);
        Calculator.add(7.8,9);

    }
}
