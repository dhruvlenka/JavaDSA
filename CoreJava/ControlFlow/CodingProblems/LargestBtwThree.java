package CoreJava.ControlFlow.CodingProblems;

import java.util.*;

public class LargestBtwThree {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the first integer: ");
       int num1 = input.nextInt();

       System.out.println("Enter the second integer: ");
       int num2 = input.nextInt();

       System.out.println("Enter the third integer: ");
       int num3 = input.nextInt();

       int largestNum = 0;

       //using two if-else
       if(num1 > num2){
           largestNum = num1;
       }
       if(num3 > largestNum){
           largestNum = num3;

       }
        System.out.println(largestNum);

       //using ternary operator
        int largestt = (num1 > num2) ?
                       (num1 > num3  ? num1: num3):
                       (num2>num3 ? num2 : num3);
        System.out.println(largestt);

        //using Math.max
        int largest = Math.max(num1, Math.max(num2, num3));
        System.out.println(largest);

        //using Collections
        List<Integer> nums = Arrays.asList(num1,num2,num3);
        int larg = Collections.max(nums);
        System.out.println(larg);
    }
}
