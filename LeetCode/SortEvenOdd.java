import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortEvenOdd {
    public static void main(String[] args) {
        int[] nums = {36,45,32,31,15,41,9,46,36,6,15,16,33,26,27,31,44,34};


    }
    public static int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());

        //Replacing even and odd elements

        int[] evenOdd = new int[nums.length];
        int e = 0;
        int o = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenOdd[i] = even.get(e);
                e++;
            } else {
                evenOdd[i] = odd.get(o);
                o++;
            }
        }

        return evenOdd;
    }
}