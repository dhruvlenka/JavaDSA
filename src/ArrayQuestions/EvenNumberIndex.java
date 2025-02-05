package ArrayQuestions;

public class EvenNumberIndex {
    public static void main(String[] args) {
        int[] arr = {12, 18, 10, 17, 15, 20};
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.println(i);}
        }
    }
}
