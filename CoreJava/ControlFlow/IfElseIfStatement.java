package CoreJava.ControlFlow;

public class IfElseIfStatement {
    public static void main(String[] args) {
        int marks = 70;
        if(marks >= 90) {
            System.out.println("You got A.");
        } else if(marks >= 80) {
            System.out.println("You got B.");
        } else if(marks >= 70) {
            System.out.println("You got C.");
        } else {
            System.out.println("You are Failed.");
        }
    }
}
