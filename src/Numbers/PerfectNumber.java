package Numbers;

import java.util.Scanner;

//Armstrong Number
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        if(isPerfectNumber(n)){
            System.out.println(n + "Perfect Number ");
        } else {
            System.out.println(n +" is not a Perfect Number");
        }
    }
    public static boolean isPerfectNumber(int n){
        int sum = 0;
        for(int i=1; i<=n/2; i++){
            if(n%1 == 0){
                 sum = sum + i;
            }
        }
        return sum == n;
    }
}
