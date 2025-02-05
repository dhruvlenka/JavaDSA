import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays2 {
    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};

        //Creating hashset for storing num1 array
        Set<Integer> set1 = new HashSet<>();
        for (int i: num1){
            set1.add(i);
        }
       //Creating hashset for comparing num1 and num2
        Set<Integer> intersection = new HashSet<>();
        for (int num: num2){
            if (set1.contains(num)){
                intersection.add(num);
            }
        }
        int[] result = new int[intersection.size()];
        int i=0;
        for(int num: intersection){
            result[i++] = num;
        }
        System.out.println(Arrays.toString(result));
    }
}
