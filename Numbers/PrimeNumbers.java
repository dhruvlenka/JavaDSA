package Numbers;

public class PrimeNumbers {
    public static void main(String[] args) {
        int start= 100;
        int end = 200;
        int count = 0;

        for (int i=start; i<=end; i++){
            if (isPrime(i)){
                count++;
                System.out.println(i + " ");
            }
        }
        System.out.println("Total count from 100 to 200: " + count);
    }
    public static boolean isPrime(int n){
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
