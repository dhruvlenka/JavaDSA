package OOPS.Inheritance;

//for hierarchical Inheritance which is also a drive
public class PersonalLoan extends Loan {
    String name;
    String address;

    PersonalLoan(int loanNo, double amount, double rateOfInterest, String name, String address){
        super(loanNo,amount,rateOfInterest);
        this.name = name;
        this.address = address;
    }
    public void getPersonalLoanDetails() {
        super.displayLoanDetails();
        System.out.println("Name " + name);
        System.out.println("Address is: " + address);
    }
}