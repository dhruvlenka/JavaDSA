package Searching;

public class SwappingFirstToLast {
    public static void main(String[] args) {
        int[] array = {22, 11, 55, 33, 44};

        int temp = array[0]; //storing first element of the array
        array[0] = array[array.length - 1]; //storing last element of the array
        array[array.length - 1] = temp; //swapping

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
