package CoreJava.ControlFlow;

public class IFStatement {
    public static void main(String[] args) {
        int age = 19;
        int age2 = 17;

        if (age >= 18){
            System.out.println("You can vote.");//true
        }

        if(age2 <= 18){
            System.out.println("You can't vote."); //false
        }

        if(age2 >= 18){
            System.out.println("You can vote.");//false: will not print anythig
        }
    }
}
