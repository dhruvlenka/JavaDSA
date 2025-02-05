import java.util.HashMap;

//Leetcode: 2540
public class MinimumCommonValue {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4};

        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i=0; i<nums1.length; i++){
            if (hash.containsKey(nums1[i])){
                continue;
            }else {
                hash.put(nums1[i],1);
            }
        }
        for (int i=0; i<nums2.length; i++){
            if (hash.containsKey(nums2[i])){
                System.out.println(nums2[i]);
            } else {
                continue;
            }
        }
        System.out.println(-1);
    }
}
