package Recursion;

//Methoc calling from method arguments
public class MethodCallingMethodArguments {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;

        int sum = getSum(getSum(x,y),z);
        System.out.println(sum);
    }
    public static int getSum(int a, int b){
        return a+b;
    }
}
