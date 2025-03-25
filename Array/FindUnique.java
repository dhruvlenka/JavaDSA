package Array;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,3,6,2}; //2,2,3,3,4,6,6
        int n = arr.length;
        System.out.println(findUnique(arr));
        System.out.println(findUnique2(arr));
        System.out.println(findUniqueElement(arr));
    }

    public static int findUnique(int[] arr){
        int n = arr.length;
        int unique = 0;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1) {
                unique = arr[i];
            }
        }
        return unique;
    }

    public static int findUnique2(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int unique = 0;

        for(int element: arr){
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        //Extracting unique elements
        for(Map.Entry<Integer, Integer> ex: map.entrySet()){
            if(ex.getValue() == 1){
                unique = ex.getKey();
            }
        }
     return unique;
    }
    public static int findUniqueElement(int[] arr) {
        int uniqueElement = 0;

        // XOR all elements in the array
        /*
        XOR of two same numbers is 0. So, XORing all elements in the array together
        leaves us with the unique element. This is because XORing any number with 0
        yields the number itself.
         */
        for (int element : arr) {
            uniqueElement ^= element;
        }

        return uniqueElement;
    }

}
