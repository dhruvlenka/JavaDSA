package Recursion;


public class Recursion_Power2 {
    static int pow=1;
    public static void main(String[] args) {



    }
    public static void getPower(int a, int b){
        if(b>0){
            pow = pow*a;
            getPower(a, b-1);
        }
    }
}
