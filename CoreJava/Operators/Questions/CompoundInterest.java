package CoreJava.Operators.Questions;

/*
In simpler terms, compound interest is “interest on interest”, which causes your money to grow faster over time compared to simple interest, which is calculated only on the principal amount.
For example:
	•	If you invest $100 at 5% compound interest per year, at the end of the first year you earn $5, making your total $105.
	•	At the end of the second year, you earn interest on $105 (not just $100), so you get $5.25 in interest, bringing the total to $110.25.
 */
public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 100000;      // Principal amount (₹)
        double monthlyRate = 0.02;      // Monthly interest rate (2%)
        int months = 12;                // Number of months (1 year)

        // Calculate total amount after compounding monthly over 1 year
        double amount = principal * Math.pow(1 + monthlyRate, months);

        // Calculate interest earned
        double interest = amount - principal;

        // Display the results
        System.out.printf("Principal: ₹%.2f%n", principal);
        System.out.printf("Total interest earned in 1 year: ₹%.2f%n", interest);
        System.out.printf("Total amount after 1 year: ₹%.2f%n", amount);

    }
}
