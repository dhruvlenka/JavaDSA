package Numbers;

public class Primee {
    public static void main(String[] args) {
        int start = 100;
        int end = 200;
        int count = 0;

        for(int i=start; i<=end; i++){
            if(primeNumbers(i)){
                System.out.println(i + " ");
                count++;
            }
        }
        System.out.println("Total Prime Number between " + start + " and " + end  + " = " + count);

    }
    public static boolean primeNumbers(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
