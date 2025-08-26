package CoreJava.Loops.JumpStatementQuestions;

import java.util.Scanner;

public class UseALoopAndExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers:  ");
        while (true){
            int num = input.nextInt();
            if(num == -1){
                break;
            }
        }
    }
}
