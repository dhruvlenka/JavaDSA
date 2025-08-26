package CoreJava.Operators.Questions;

public class StudentPassed {
    public static void main(String[] args) {
        int subject1 = 80;
        int subject2 = 95;
        int subject3 = 70;
        int subject4 = 85;
        int subject5 = 90;

        if (subject1 > 50 && subject2 > 50 && subject3 > 50 && subject4 > 70 && subject5 > 80){
            System.out.println("Passed in the examination.");
        } else {
            System.out.println("Failed in examination.");
        }
    }
}
