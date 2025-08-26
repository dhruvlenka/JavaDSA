package Array;

/*
Write a program that uses a for-each loop to print the square of each element in an array,
but skips elements greater than 10. The elements of the array are 2, 10, 12, 6, 15}.
 */
public class SquareOfEachElement {
    public static void main (String[] args) {
        int[] values = {2, 10, 12, 6, 15};
        // Complete the code
        for(int val: values){
            if(val > 10){
                continue;
            }
            System.out.println(val*val + " ");
        }

    }
}
