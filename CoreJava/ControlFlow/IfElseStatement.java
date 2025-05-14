package CoreJava.ControlFlow;

public class IfElseStatement {
    public static void main(String[] args) {
        int password = 123456;

        if(password == 123456){ //true
            System.out.println("You can access the system."); //print
        } else {
            System.out.println("You can't access the system.");
        }

        if(password == 878712){
            System.out.println("You can access the system.");
        } else { //false
            System.out.println("You can't access the system."); //print
        }
    }
}
