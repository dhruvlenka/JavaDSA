package CoreJava.Loops.JumpStatementQuestions;

import java.util.Scanner;

public class NumberDivisible2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        for(int i=1; i<=10; i++){
            int num = input.nextInt();
            if(num % 4 == 0){
                continue;
            }
            System.out.println(num);
        }
    }
}
