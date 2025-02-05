import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        Set<Integer> n1 = new HashSet<>();
        for (int i : nums1) {
            n1.add(i);
        }
        Set<Integer> n2 = new HashSet<>();
        for (int i : nums2) {
            n2.add(i);
        }
        //.retainAll: give intersection
        n1.retainAll(n2);
        System.out.println(n1);

        int[] result = new int[n1.size()];
        int i=0;
        for (int num: n1){
            result[i++] = num;
        }
        //printing the intersection of nums1 and nums2
        System.out.println(Arrays.toString(result));
    }
}