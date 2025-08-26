package CoreJava.Operators.Questions;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        int principle = 100000;
        /*
        Interest rates are usually given as percentages. For example, 2% means 2 per 100, or 2 out of 100.
        To use interest rates in formulas, you convert the percentage to a decimal by dividing by 100.
        So 2% becomes 2/100 = 0.02 as a decimal
         */

        double monthlyRate = 0.02; //(monthly interest rate as decimal)
        int months = 12;
        int interest = (int)(principle * monthlyRate * months);
        System.out.println(interest);


        double annualRate = 0.24; //(annual interest rate as decimal, because 2% per month × 12 months)
        int year = 1;
        int interest2 = (int)(principle * annualRate * year);
        System.out.println(interest2);

        int totalDue = principle + interest;
        System.out.println(totalDue);
    }
}
