package CoreJava.ControlFlow.CodingProblems;

public class CheckAInteger {
    public static void main(String[] args) {
        int integer = -120;
        if(integer > 0) {
            System.out.println("Positive");
        }  else if(integer < 0){
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
