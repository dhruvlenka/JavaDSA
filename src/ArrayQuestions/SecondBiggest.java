package ArrayQuestions;

public class SecondBiggest {
    public static void main(String[] args) {
        int[] arr = {80,80,30,12,45,55,60,43};
        secondBiggest(arr);
    }
    public static void secondBiggest(int[] arr){
        int biggest = arr[0];
        int second_biggest = arr[1]; //Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > biggest){
                second_biggest = biggest;
                biggest = arr[i];
            } else if(arr[i] > second_biggest && arr[i] != biggest){
                second_biggest = arr[i];
            }
        }
        System.out.println(biggest);
        System.out.println(second_biggest);
    }
}
