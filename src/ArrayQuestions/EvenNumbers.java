package ArrayQuestions;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] arr = {12, 18, 10, 20};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);

            }
        }

    }
    public static boolean checkEven(int[] arr){
        for(int x: arr){
            if(x % 2 == 1){
                return false;
            }
        }
        return true;
    }

    public static boolean checkEven2(int[] arr){
        for(int x: arr){
            if(x % 2 == 0){
                return true;
            }
        }
        return false;
    }
}
