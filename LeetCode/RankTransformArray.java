import java.util.Arrays;
import java.util.HashMap;

public class RankTransformArray {
    public static void main(String[] args) {
        int[] arr = {40,10,20,30};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int[] ans = arrayRankTransform(arr);
        for (int a: ans){
            System.out.println(a);
        }

    }
    public static int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        //array copying
        int[] copyArray = Arrays.copyOf(arr,arr.length);
        //sorting array
        Arrays.sort(copyArray);
        int count = 1;
        for (int k : copyArray) {
            if (!hash.containsKey(k)) {
                hash.put(k, count++);
            }
        }
        int[] ans = new int[copyArray.length];
        for (int j = 0; j < arr.length; j++) {
            ans[j] = hash.get(arr[j]);
        }
        return ans;
    }
}
