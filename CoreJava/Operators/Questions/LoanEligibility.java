package CoreJava.Operators.Questions;

public class LoanEligibility {
    public static void main(String[] args) {
        int personAge = 25;
        int salary = 50000;
        if(personAge > 18 && salary > 30000){
            System.out.println("You are eligible for the loan.");
        } else {
            System.out.println("You are not eligible for loan.");
        }
    }
}
