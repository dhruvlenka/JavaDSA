package ArrayQuestions;

public class BiggestNumber {
    public static void main(String[] args) {
        int[] arr = {12, 18, 10, 17, 15, 20, 90};
        System.out.println("Biggest: "+ getBiggest(arr));

        System.out.println("Difference b/w Biggest and Smallest: " + getDifferenceBiggestSmallest(arr));

    }

    public static int getBiggest(int[] arr){
        int biggest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > biggest){
                biggest = arr[i];
            }
        }
        return biggest;
    }

    public static int getDifferenceBiggestSmallest(int[] arr){
        int largest = arr[0];
        int smallest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return largest-smallest;
    }
}
