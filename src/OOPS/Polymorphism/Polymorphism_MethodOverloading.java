package OOPS.Polymorphism;

class adder {
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
}
public class Polymorphism_MethodOverloading {
    public static void main(String[] args) {
        int a1 = adder.add(10,11);
        int a2 = adder.add(10, 20, 30);
        System.out.println(a1);
        System.out.println(a2);
    }
}
