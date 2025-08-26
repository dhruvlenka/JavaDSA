package CoreJava.ControlFlow.CodingProblems;

public class PrintNumbers {
    public static void main(String[] args) {
        //printing numbers from 0 to 100 using for-loop
        for(int i=0; i<=100; i++){
            System.out.println(i);
        }
        System.out.println();

        //do-while loop
        int i=0;
        do{
            System.out.println(i++);
        } while (i<=100);
    }
}
