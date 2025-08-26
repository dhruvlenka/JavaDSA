package CoreJava.Operators.Questions;

public class GradeBasedOnMarks {
    public static void main(String[] args) {
        int marks = 450;
        String grade = (marks >= 400) ? "A++"
                : (marks >= 300) ? "A"
                : (marks >= 250) ? "B"
                : (marks <= 250) ? "C"
                : "F";

        System.out.println("Grade: " + grade);
    }
}
