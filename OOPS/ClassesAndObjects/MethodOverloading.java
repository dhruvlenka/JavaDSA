package OOPS.ClassesAndObjects;

public class MethodOverloading {

    public  int add(int a, int b){
        return a+b;
    }
    public  String add(String a, String b){
        return a+b;
    }
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        System.out.println(mo.add(10,5));
        System.out.println(mo.add("Hello", "World!"));
    }
}
