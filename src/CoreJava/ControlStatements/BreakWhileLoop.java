package CoreJava.ControlStatements;

//Break: while loop
public class BreakWhileLoop {
    public static void main(String[] args) {
        int num = 100;
        while (num < 110){
            if(num == 105) {
                break;
            }
            System.out.println("num: " + num);
            num++;
        }
        System.out.println("While Loop Complete");
    }
}
