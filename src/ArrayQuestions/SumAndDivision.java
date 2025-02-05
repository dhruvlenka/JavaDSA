package ArrayQuestions;

public class SumAndDivision {
    public static void main(String[] args) {
        int[] arr = {12,24,30,12,45,55,60,43};
        int[] arr2 = {12,24,30,12,45,55,60,43, 60};

        boolean result = sumAndDivisible(arr);
        if(result){
            System.out.println("Divisible by 4");
        } else {
            System.out.println("Not divisible by 4");
        }

        System.out.println();

        if(sumAndDivisible(arr2)){
            System.out.println("Yes, it's divisble by 4");
        } else {
            System.out.println("Oops, it's not divisible bh 4");
        }
        //directly passing in if statment without storing into a boolean datatype

    }
    public static boolean sumAndDivisible(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum is: " + sum);
        return sum % 4 ==0;
    }
}
