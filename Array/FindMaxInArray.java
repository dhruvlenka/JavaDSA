package Array;

public class FindMaxInArray {
    public static void main(String[] args) {
        int[] maxInArray = {10,15,20,25,30,45,9,5,3};
        int max = 0;
        for(int i=0; i<maxInArray.length; i++){
            if (maxInArray[i] > max){
                max = maxInArray[i];
            }
        }
        System.out.println(max);
    }
}
