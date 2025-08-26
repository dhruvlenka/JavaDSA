package CoreJava.ControlFlow.CodingProblems;

public class ExamScore {
    public static void main(String[] args) {
        int examScore = 65;
        if(examScore >= 68){
            System.out.println("Pass for UR");
        } else if(examScore >= 62 && examScore <= 68){
            System.out.println("Pass for SC and EWS");
        } else {
            System.out.println("Fail");
        }
    }
}
