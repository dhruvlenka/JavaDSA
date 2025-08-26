package CoreJava.Loops.JumpStatementQuestions;

public class PrimeNumbers {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            //firstly checking it's even number or not
            if(i % 2 == 0 && i !=2){
                continue;
            }
            //second checking the number is prime number or not
            if(isPrime(i)){
                System.out.println(i);
            }
        }
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
