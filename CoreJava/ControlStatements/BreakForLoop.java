package CoreJava.ControlStatements;

public class BreakForLoop {
    public static void main(String[] args) {
        for(int i=1; i<100; i++){
            if(i==10){
                break;
            }
            System.out.println("i: " + i);
        }
        System.out.println("Loop Completed ");
    }
}
