import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//LeetCode: 350
public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
          int[] nums1 = {1,2,2,1};
          int[] nums2 = {2,2};

        List<Integer> arr = new ArrayList<>();
               //Key, Value
        HashMap<Integer,Integer> hash = new HashMap<>();
        HashMap<Integer,Integer> hash2 = new HashMap<>();
        for (int j : nums1) {
            if (hash.containsKey(j)) {
                hash.put(j, hash.get(j) + 1);
            } else {
                hash.put(j, 1);
            }
        }
        for (int j : nums2) {
            if (hash2.containsKey(j)) {
                hash2.put(j, hash2.get(j) + 1);
            } else {
                hash2.put(j, 1);
            }
        }
        for (Integer Key: hash.keySet()){
            if (hash2.containsKey(Key)){
                int x = Math.min(hash2.get(Key), hash.get(Key));
                while (x-- > 0){
                    arr.add(Key);
                }
            }
        }
        int[] result = new int[arr.size()];
        int i=0;
        for (int num: arr){
            result[i++] = num;
        }
        System.out.println(Arrays.toString(result));
    }
}
