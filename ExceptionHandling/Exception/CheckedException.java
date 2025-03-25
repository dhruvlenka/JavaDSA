package ExceptionHandling.Exception;

//will not give error on compilation, it will give error on runtime.
public class CheckedException {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Starts");
        int i = 1;
        while(i <= 10){
            System.out.println("i is: " + i);
            Thread.sleep(i); //InterruptedException
            i++;
        }


    }
}

