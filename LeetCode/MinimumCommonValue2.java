import java.util.Set;
import java.util.TreeSet;

//2540
public class MinimumCommonValue2 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4};

//        Set<Integer> tree1 = new TreeSet<>();
//        Set<Integer> tree2 = new TreeSet<>();
//        for (int n: nums1){
//            tree1.add(n);
//        }
//        for (int n2: nums2){
//            tree2.add(n2);
//        }
//
//        for (Integer num: tree1){
//            if (tree2.contains(num)){
//                System.out.println(num);
//            }
//        }
//        System.out.println(-1);

        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            }
            else if (nums1[i] > nums2[j]) {
                j++;
            }
            else {
                System.out.println(nums1[i]);
                break;
            }
        }
        System.out.println(-1);
    }
}
