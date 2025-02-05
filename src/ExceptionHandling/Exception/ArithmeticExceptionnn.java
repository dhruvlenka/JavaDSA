package ExceptionHandling.Exception;

public class ArithmeticExceptionnn {
    public static void main(String[] args) {
        try {
            int num = 500/0;
        } catch (Exception ex){
            System.out.println("Exception Starts.");
            System.out.println(ex);
        }
        System.out.println("Exeption Handled.");
    }

}
