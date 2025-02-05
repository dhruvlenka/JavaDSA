package ArrayQuestions;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] arr = {12, 18, 10, 17, 15, 20, 90};
        System.out.println("Biggest: "+ getSmallest(arr));
    }
    public static int getSmallest(int[] arr){
        int smallest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
