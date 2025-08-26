package CoreJava.Loops.JumpStatementQuestions;

public class PrintANumberUsingBreak {
    public static void main(String[] args) {
        for(int i=1; i<=50; i++){
            System.out.println(i);
            if(i==25){
                break;
            }
        }
    }
}