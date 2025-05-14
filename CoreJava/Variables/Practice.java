package CoreJava.Variables;

public class Practice {
    int instanceVariable = 100;

    public static void main(String[] args) {
        int a = 5; //local variable
        int b = 10;
        System.out.println(a+b);

        Practice obj = new Practice();
        System.out.println(obj.instanceVariable);
    }
}
