package Array;

public class FindMinInArray {
    public static void main(String[] args) {
        int[] minInArray = {10,2,5,1,6,7,8,9,15};
        int min = 99999; //acts like temporary var
        for (int i=0; i<minInArray.length; i++){ //traverse
            if (minInArray[i] < min){
               min = minInArray[i];
            }
        }
        System.out.println(min);
    }
}
