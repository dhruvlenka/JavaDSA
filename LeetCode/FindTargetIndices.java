import java.util.ArrayList;
import java.util.Arrays;

//LeetCode: 2089
public class FindTargetIndices {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;
        Arrays.sort(nums);
        ArrayList indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                indices.add(i);
            }
        }
        System.out.println(indices);

    }
}
