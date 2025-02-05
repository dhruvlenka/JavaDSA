package ArrayQuestions;

public class ArrayStrictlyIncreasing {
    public static void main(String[] args) {
        int[] arr = {12,15,16,20,35,50,60};
        boolean result = strictlyIncreasing(arr);
        System.out.println(result);

        int[] arr2 = {12,17,13,21,14,25,60};
        boolean result2 = strictlyIncreasing(arr2);
        System.out.println(result2);
    }
    public static boolean strictlyIncreasing(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1] < arr[i]){
                return false;
            }
        }
        return true;
    }
}
