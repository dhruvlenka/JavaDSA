package CoreJava.ControlFlow;

public class NestedIfStatement {
    public static void main(String[] args) {
        int a = 50;
        int b = 80;
        if(a<b){
            System.out.println("a is greater than b.");
            if(a>20){
                System.out.println("a is greater than 100.");
                if(b>a){
                    System.out.println("b is less than a.");
                }
            }
        }
    }
}
