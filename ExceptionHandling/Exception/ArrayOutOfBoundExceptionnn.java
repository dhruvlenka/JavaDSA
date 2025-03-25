package ExceptionHandling.Exception;

public class ArrayOutOfBoundExceptionnn {
    public static void main(String[] args) {
        try {
            int[] arr = new int[10];
            arr[11] = 11;
        } catch (Exception ex){
            System.out.println("Exception starts.");
            System.out.println(ex);
        }
        System.out.println("ArrayIndexOutOfBound exception is handled.");
    }
}
