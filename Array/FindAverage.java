package Array;

public class FindAverage {
    public static void main(String[] args) {
        int[] average = {10,15,20,9,32,22,17,16,12,18};
        int sum = 0; //will acts like temp var
        for(int i=0; i<average.length; i++){
            sum = sum + average[i];
        }
        System.out.println(sum/ average.length);
    }
}
