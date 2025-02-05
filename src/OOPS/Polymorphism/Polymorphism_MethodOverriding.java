package OOPS.Polymorphism;

//Method overriding: methods having same name
class Bank {
    double rateOfInterest(){
        return 0;
    }
}

//subclass also called Derived class
class HDFC extends Bank {
    @Override
    double rateOfInterest(){
        return 18.5;
    }
}
class ICICI extends Bank {
    @Override
    double rateOfInterest(){
        return 12.5;
    }
}
class SBI extends Bank {
    @Override
    double rateOfInterest(){
        return 14.7;
    }
}
class PNB extends Bank {
    @Override
    double rateOfInterest(){
        return 16.8;
    }
}
public class Polymorphism_MethodOverriding {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.rateOfInterest());

        HDFC hdfc = new HDFC();
        System.out.println(hdfc.rateOfInterest());

        ICICI icici = new ICICI();
        System.out.println(icici.rateOfInterest());

        SBI sbi = new SBI();
        System.out.println(sbi.rateOfInterest());

        PNB pnb = new PNB();
        System.out.println(pnb.rateOfInterest());

        System.out.println();
        Bank b1 = new HDFC();
        System.out.println(b1.rateOfInterest());
    }
}
