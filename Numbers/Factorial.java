package Numbers;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int fac = 1;
        for(int i = 1; i<=num; i++){
            fac *= i;
        }
        System.out.println(fac);
    }
}
