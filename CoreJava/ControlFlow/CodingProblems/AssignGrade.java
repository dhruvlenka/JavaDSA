package CoreJava.ControlFlow.CodingProblems;

public class AssignGrade {
    public static void main(String[] args) {
        int marks = 60;

        if(marks >= 95) {
            System.out.println("A++");
        } else if (marks >= 70 && marks<=90){
            System.out.println("A+");
        } else if(marks > 50 && marks < 70){
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
