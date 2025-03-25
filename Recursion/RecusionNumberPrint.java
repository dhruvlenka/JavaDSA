package Recursion;

public class RecusionNumberPrint {
    static int num = 0;
    public static void main(String[] args) {
        numberHundredToOne(100);
    }
    public static void numberOneToHundred(int n){
        if(n<=100){
            System.out.println(n);
            numberOneToHundred(n+1);
        }
    }
    public static void numberHundredToOne(int n){
        if(n>=0){
            System.out.println(n);
            numberHundredToOne(n-1);
        }
    }
}
