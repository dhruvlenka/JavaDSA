package OOPS.Inheritance;

//for hierarchical inheritance
public class Loan {
    int loanNumber;
    double amount;
    double rateOfInterest;

    Loan() {

    }
    Loan(int loanNumber, double amount, double rateOfInterest){
        this.loanNumber = loanNumber;
        this.amount = amount;
        this.rateOfInterest = rateOfInterest;

    }

    public void displayLoanDetails(){
        System.out.println("Loan Number: " + loanNumber);
        System.out.println("Loan Amount: " + loanNumber);
        System.out.println("Loan Rate of Interest: " + rateOfInterest);
    }
}

